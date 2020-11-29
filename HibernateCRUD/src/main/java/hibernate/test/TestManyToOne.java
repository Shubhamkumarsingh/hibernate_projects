package hibernate.test;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.bean.manytoone.Address;
import hibernate.bean.manytoone.Student;

public class TestManyToOne {
	private static final String path="C:\\workspace-spring-tool-suite\\HibernateCRUD\\src\\main\\java\\hibernate\\bean\\manytoone\\hibernate.cfg.xml";
	public static void main(String args[]) {
		Session session=null;
		Transaction transaction = null;
		try
		{
	 session= new Configuration().configure(new File(path)).buildSessionFactory().openSession();
	 transaction= session.beginTransaction();
	 Address address= new Address("OMG Road", "Chennai", "Tamil Nadu", "887912");
	 Student student1= new Student("Ramesh", address);
	 Student student2= new Student("Suresh", address);
	 session.save(student1);
	 session.save(student2);
	 transaction.commit();
		}catch(Throwable th) {
			transaction.rollback();
			th.printStackTrace();
		}finally {
			session.close();
		}
	}

}
