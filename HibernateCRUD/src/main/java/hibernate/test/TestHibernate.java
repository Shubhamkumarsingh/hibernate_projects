package hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.bean.EmployeeEntity;
import hibernate.connection.HibernateUtil;

public class TestHibernate {
	public static void main(String args[]) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction tx= session.getTransaction();
		tx.begin();
		EmployeeEntity employeeEntity= new EmployeeEntity();
		employeeEntity.setEmpName("Rayu");
		employeeEntity.setEmpSalary(120000);
		session.save(employeeEntity);
		tx.commit();
		HibernateUtil.shutDown();
	}
}
