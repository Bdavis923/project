package capstone.util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionUtil {



	public static SessionFactory getSessionFactory() {
		File f = new File("C:\\Users\\davis\\workspace\\Capstone-project\\src\\main\\java\\capstone\\resources\\hibernate.cfg.xml"); 
		SessionFactory sessionFactory= new Configuration().configure(f).buildSessionFactory();
		return sessionFactory;

	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}

}
