package hibernate.bean.OneToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1760288496438522116L;
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	private Integer id;
	
	private String name;
	
	private Address address;
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToOne(cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
