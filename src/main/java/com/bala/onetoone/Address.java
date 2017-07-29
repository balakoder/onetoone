package com.bala.onetoone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
 
	@Column(name = "street", nullable = false, length=250)
	private String street;
	
	
	@Column(name = "city", nullable = false, length=50)
	private String city;
	
	@Column(name = "state", nullable = false, length=50)
	private String state;
	
	@Column(name = "zip", nullable = false, length=10)
	private String zipcode;

	public Address() {
	}

	public Address(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	
	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}