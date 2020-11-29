package hibernate.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.OneToOne.Address;
import hibernate.bean.OneToOne.Student;
import hibernate.connection.HibernateUtil;

public class TestOneToOne {
	public static void main(String args[]) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction t= null;
		try {
			t= session.beginTransaction();
			
			Address address1=new Address("MG Road", "Bangalore", "Karnataka", 221122);
			Student std1= new Student("Rayu", address1);
			session.save(std1);
			
			Address address2= new Address("Toll road", "Delhi", "Delhi", 11111);
			Student std2= new Student("Yuhan", address2);
			session.save(std2);
			t.commit();
		}catch(HibernateException he) {
			t.rollback();
			he.printStackTrace();
		}finally {
			session.close();
		}
	}

}
