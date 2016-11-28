package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.http.impl.cookie.*;
import org.apache.http.cookie.Cookie;
import org.rapidoid.annotation.Service;
import org.rapidoid.http.Req;
import org.rapidoid.http.Resp;
import org.rapidoid.http.handler.param.CookieParamRetriever;
import org.rapidoid.http.impl.RespImpl;
import org.rapidoid.io.Res;
import org.rapidoid.jpa.JPA;
import org.rapidoid.security.Role;
import org.rapidoid.security.annotation.Roles;

import application.entity.Customer;
import application.entity.Ticket;

public class LoginCustomer {

	private LoginCustomer() {

	}
	public static boolean login(Req req,String username, String password) {
		EntityManager em = JPA.em();
		String sqlString = "Select * from Repairs.dbo.Customer c " + "where c.password=" + password;
		Query q = em.createNativeQuery(sqlString, Customer.class);
		List<Customer> customers = q.getResultList();
		if (customers.size() >= 1 && customers.get(0).getPassword().equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}

}
