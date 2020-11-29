package hibernate.bean.onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Two")
public class StudentTwo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8616014261920591541L;
	
	private long studentId;
	private String studentName;
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>();
	
	public StudentTwo(String studentName, Set<Phone> studentPhoneNumbers) {
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "student_id")
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "student_name", nullable = false, length = 100)
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Phone", joinColumns = { @JoinColumn(name="student_id")}, inverseJoinColumns = {@JoinColumn(name= "phone_id")})
	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}
	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}
	

}
