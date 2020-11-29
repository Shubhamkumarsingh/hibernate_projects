package hibernate.test;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.bean.manytomany.Course;
import hibernate.bean.manytomany.Student;

public class TestManyToMany {
	private static final String path="C:\\workspace-spring-tool-suite\\HibernateCRUD\\src\\main\\java\\hibernate\\bean\\manytomany\\hibernate.cfg.xml";
	public static void main(String args[]) {
		Session session= null;
		Transaction transaction= null;
		try {
			session= new Configuration().configure(new File(path)).buildSessionFactory().openSession();
			transaction= session.beginTransaction();
			Set<Course> courses= new HashSet<Course>();
			courses.add(new Course("Computer Science"));
			Student student1 = new Student("Kamlesh", courses);
			courses.add(new Course("Maths"));
			Student student2= new Student("Mahesh", courses);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
