//package bean;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//
//
//import org.hibernate.Session;
//
//import jpa.Customer;
//import util.HibernateUtil;
//
//
//
//
//
//@ManagedBean
//@RequestScoped
//public class AddCustomerBean {
//
//	private Customer tempCustomer = new Customer();
//
//	private String message = null;
//
//	public AddCustomerBean() {
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public Customer getTempCustomer() {
//		return tempCustomer;
//	}
//
//	public void setTempCustomer(Customer tempCustomer) {
//		this.tempCustomer = tempCustomer;
//	}
//
//	public String submitChanges() {
//		tempCustomer.setPassword("password"); // (Over)write any set password to
//		String url = "login?faces-redirect=true"; // make all customers'
//													// passwords
//													// uniform
//		
//		//Searches for customer by using the temp cusomter ID and maps it
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		Customer customer = session.find(Customer.class,
//				tempCustomer.getVid());
//		session.getTransaction().commit();
//
//		//if customer is found  keeps user on same page and displays message that user exists
//		if (customer != null) {
//
//			message = "User Exists";
//			return "";
//			
//		} else {//if customer is not found adds temp user to table and directs user to login page to log in
//			session.getTransaction().begin();
//			session.persist(tempCustomer);
//			session.getTransaction().commit();
//			return "login?faces-redirect=true";
//
//		}
//
//	}
//	
//	//added forgot pass word method for users that forget password
//	public String forgotPassword(){
//		message = null;
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		
//		//Searches for customer by using the temp cusomter ID and maps it
//		session.getTransaction().begin();
//		Customer customer = session.find(Customer.class,
//				tempCustomer.getVid());
//		session.getTransaction().commit();
//		//if customer found runs code
//		if (customer != null) {
//			//verify if userid and email matches whats in database and displays password
//			if(customer.getVid() == (tempCustomer.getVid()) && customer.getEmail().equals(tempCustomer.getEmail().trim()) ){
//				message = "Password is: " + customer.getPassword();
//			}else{//if email do not match displays message
//				message = "Information does not match";
//			}
//		}else{//if user not found displays this message
//			message = "User Not found";
//		}
//		
//		return message;
//	}
//
//}