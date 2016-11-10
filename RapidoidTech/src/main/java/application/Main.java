package application;

import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.Param;
import org.rapidoid.annotation.Valid;
import org.rapidoid.jpa.JPA;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;

public class Main {

	public static void main(String[] args) {
	
		App.bootstrap(args).jpa();
		
		 On.get("/books").json(() -> JPA.of(Book.class).all()); // get all books
		 
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
