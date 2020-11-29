package hibernate.bean.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682904730609101548L;
	
	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private long addressId;
	
	@Column(name = "address_street", nullable = false, length = 100)
	private String street;
	
	@Column(name = "address_city", nullable = false, length = 100)
	private String city;
	
	@Column(name = "address_state", nullable = false, length = 100)
	private String state;
	
	@Column(name = "address_zipcode", nullable = false, length = 15)
	private String zipcode;
	
	public Address(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
