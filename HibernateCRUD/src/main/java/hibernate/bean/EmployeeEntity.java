package hibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="employee", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "name")
})
public class EmployeeEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2719414309922648413L;
	@Id
	@GeneratedValue
	@Column(name = "id",unique = true, nullable = false)
	private Integer empId;
	@Column(name = "name", unique = false, nullable = false, length = 80)
	private String empName;
	@Column(name = "salary", unique = false, nullable = true, length = 20)
	private Integer empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	

}
