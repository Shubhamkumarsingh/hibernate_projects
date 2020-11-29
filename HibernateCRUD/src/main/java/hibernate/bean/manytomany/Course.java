package hibernate.bean.manytomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5028388380437116142L;
	
	@Id
	@GeneratedValue
	@Column(name = "course_id", nullable = false)
	private long courseId;
	
	@Column(name = "course_name", nullable = false, length = 100)
	private String courseName;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
