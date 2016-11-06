package capstone;

import java.util.Date;

import org.hibernate.*;


import capstone.model.jpa.Customer;
import capstone.model.jpa.Employee;
import capstone.model.jpa.Equipment;
import capstone.model.jpa.Ticket;
import capstone.util.SessionUtil;

public class Test {


	public static void main(String[] args) {
		
		
		Session session = SessionUtil.getSessionFactory().openSession();
		session.beginTransaction();
				        
		
		        

		  Date date = new Date();
		  
		  Employee emp = new Employee(32259990, "Brian", "st", "asd", "ea@aol.com", "856-965-5955", "2853 lan ave", "orlando", "FL", "08104", true, true);
		  Customer cus = new Customer(32173990, "Brown", "Quint", "qb@aol.com", "856-964-8888");
		  Equipment eq = new Equipment("watches");
		  
		Ticket tik = new Ticket(cus, emp, eq, "This monasdfitor will not turn on", "Black Screen", date, date, "asdqweqwe", date, date, date, date, "khgsdfjg");
	
		  session.save(emp);
		  session.save(cus);
		  session.save(eq);
		  session.save(tik);

		  session.getTransaction().commit();
			
	     session.close();
		  

		  System.out.println("loloskafjksdf");
		  System.exit(0);
		  
	}

}
