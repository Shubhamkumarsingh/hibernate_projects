package hibernate.connection;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory= buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure(new File("C:\\workspace-spring-tool-suite\\HibernateCRUD\\src\\hibernate.cfg.xml")).buildSessionFactory();
		}catch(Throwable th) {
			System.out.println("Exception occured while creating the object of sessionfactory.");
			throw new ExceptionInInitializerError("SessionFactory object creation failed. "+th);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutDown() {
		getSessionFactory().close();
	}

}
