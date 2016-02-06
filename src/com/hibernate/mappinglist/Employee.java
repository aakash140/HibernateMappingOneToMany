package com.hibernate.mappinglist;

import java.util.List;

/**
 * 
 * @author aakash.gupta
 *
 */
public class Employee {

	private int emp_id;
	private String firstName;
	private String lastName;
	private List<ContactDetails> contact;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<ContactDetails> getContact() {
		return contact;
	}
	public void setContact(List<ContactDetails> contact) {
		this.contact = contact;
	}
}