package com.bala.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
@Entity
@Table(name = "student")
public class Student {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
 
	/*
	 * 
	 * 
	 * In this technique, main annotation to be used is @JoinTable.
	 *  This annotation is used 
	 * to define the new table name (mandatory) and foreign keys from both of the tables
	 */
	/*
	 * @OneToOne(cascade = CascadeType.ALL)  onlt this 
	 * this will create entry in stdent table as student
	 * studentAddress_ADDRESS_ID column 
	 * 
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="student_address", joinColumns = @JoinColumn(name="address_id"),
	inverseJoinColumns = @JoinColumn(name="student_id"))
	private Address address;

	public Student() {
	}

	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
 	 

}