package hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.onetomany.Phone;
import hibernate.bean.onetomany.StudentTwo;
import hibernate.connection.HibernateUtil;

public class TestOneToMany {
	public static void main(String args[])
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction transaction= null;
		try {
			transaction= session.beginTransaction();
			Set<Phone> studentPhoneNumbers = new HashSet<Phone>();
			studentPhoneNumbers.add(new Phone("home", "9876543221"));
			studentPhoneNumbers.add(new Phone("mobile", "123456789"));
			StudentTwo student = new StudentTwo( "Yuhan", studentPhoneNumbers);
			session.save(student);
			transaction.commit();
		}catch(HibernateException hbe) {
			transaction.rollback();
			hbe.printStackTrace();
		}finally {
			session.close();
		}
	}

}
