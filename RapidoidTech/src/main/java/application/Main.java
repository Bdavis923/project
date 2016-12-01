package application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.Param;
import org.rapidoid.annotation.Valid;
import org.rapidoid.goodies.Goodies;
import org.rapidoid.http.Req;
import org.rapidoid.jpa.JPA;
import org.rapidoid.security.Role;
import org.rapidoid.setup.App;
import org.rapidoid.setup.My;
import org.rapidoid.setup.On;
import org.rapidoid.u.U;

import application.entity.*;

public class Main {

	public static void main(String[] args) {

		App.bootstrap("profiles=sqlserver").auth().jpa();

		On.get("/").mvc(Goodies.config());

		On.get("/books").json(() -> JPA.of(Book.class).all()); // get all books

		On.get("/customer/all").json(() -> JPA.of(Customer.class).all());

		On.get("/employee/all").json(() -> JPA.of(Employee.class).all());

		On.get("/equipment/all").json(() -> JPA.of(Equipment.class).all());

		On.get("/login").roles("manager").html((req, resp) -> "Login Successful");

		On.get("/manage").roles("manager").html((req, resp) -> "this is private!");

		// POST to /_login to hit the login feature
		My.loginProvider((req, username, password) -> LoginCustomer.login(req, username, password));
		My.rolesProvider((req, username) -> U.set("manager"));

		On.get("/ticket/all").json(() -> JPA.of(Ticket.class).all());

		On.post("/books").json((@Valid Book b) -> JPA.save(b)); // insert new
																// book if valid

		On.get("/size").json((String msg) -> msg.length());

		On.get("/concate").json((String msg1, String msg2) -> msg1 + " " + msg2);

		App.beans(new Object() {

			@GET
			public Double perimeter(@Param("width") Double width, @Param("length") Double length) {
				return length * width;
			}

			@GET(uri = "/tickets")
			public List<Ticket> getTickets(Req req) {
				EntityManager em = JPA.em();
				if (req.token().get("_user") != null) {
					String sqlString = "Select * from Repairs.dbo.Ticket t " + "where t.Customer="
							+ req.token().get("_user");
					Query q = em.createNativeQuery(sqlString, Ticket.class);

					return q.getResultList();
				} else {
					return null;
				}
			}
		});

	}

}
