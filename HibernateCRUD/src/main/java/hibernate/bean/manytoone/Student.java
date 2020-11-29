package hibernate.bean.manytoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6312505599862819763L;
	private long studentId;
	private String studentName;
	private Address address;
	public Student(String studentName, Address address) {
		this.studentName = studentName;
		this.address = address;
	}
	@Id
	@GeneratedValue
	@Column(name = "student_id", nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "student_name", nullable = false, length = 100)
	public String getStudent_name() {
		return studentName;
	}
	public void setStudent_name(String student_name) {
		this.studentName = student_name;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
