package hibernate.bean.onetomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Phone")
public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4939919541058220725L;
	private long phoneId;
	private String phoneType;
	private String phoneNumber;
	
	public Phone(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "phone_id", nullable = false, length = 100)
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	
	@Column(name = "phone_type", nullable = false, length = 20)
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	@Column(name = "phone_number", nullable = false, length = 15)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
