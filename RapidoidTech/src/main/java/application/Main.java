package application;

import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.Param;
import org.rapidoid.annotation.Valid;
import org.rapidoid.goodies.Goodies;
import org.rapidoid.jpa.JPA;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;

import application.entity.*;

public class Main {

	public static void main(String[] args) {
	
		App.bootstrap("profiles=sqlserver").jpa();
		
		On.get("/").mvc(Goodies.config());
		
		 On.get("/books").json(() -> JPA.of(Book.class).all()); // get all books
		
		 On.get("/customer/all").json(() -> JPA.of(Customer.class).all());
		 
		 On.get("/employee/all").json(() -> JPA.of(Employee.class).all());
		 		 
		 On.get("/equipment/all").json(() -> JPA.of(Equipment.class).all());
		 
		 On.get("/ticket/all").json(() -> JPA.of(Ticket.class).all());
		 
	     On.post("/books").json((@Valid Book b) -> JPA.save(b)); // insert new book if valid
	     
	     On.get("/size").json((String msg) -> msg.length());
	     
	     On.get("/concate").json((String msg1,String msg2 ) -> msg1 + " " +  msg2 );
	     
	     App.beans(new Object() {
	    	 
	    	 @GET
	    	 public Double perimeter(@Param("width") Double width, @Param("length") Double length){
	    		 return length * width;
	    	 }
	     }); 


	}

}
