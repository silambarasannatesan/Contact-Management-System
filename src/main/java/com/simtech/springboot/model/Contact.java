package com.simtech.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "phone")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6567052777875433528L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contact_ID;

	@NotEmpty
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "contact_number", nullable = false)
	private double contactNumber;

	public Long getcontact_ID() {
		return contact_ID;
	}

	public void setcontact_ID(Long id) {
		this.contact_ID = contact_ID;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String name) {
		this.lastName = name;
	}

	public Long getContact_ID() {
		return contact_ID;
	}

	public void setContact_ID(Long contact_ID) {
		this.contact_ID = contact_ID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}

}
