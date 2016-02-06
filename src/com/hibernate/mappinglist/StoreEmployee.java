package com.hibernate.mappinglist;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author aakash.gupta
 *
 */
public class StoreEmployee {

	public void storeEmployee(Session session) {
		Transaction transaction=session.beginTransaction();
		
		ContactDetails contact1=new ContactDetails();
		contact1.setPhoneNumber(987654321L);
		contact1.setType("Mobile");
		
		ContactDetails contact2=new ContactDetails();
		contact2.setPhoneNumber(4984894194L);
		contact2.setType("Home");
		
		ArrayList<ContactDetails> contactList=new ArrayList<ContactDetails>();
		contactList.add(contact1);
		contactList.add(contact2);
		
		Employee employee=new Employee();
		employee.setContact(contactList);
		employee.setFirstName("Aakash");
		employee.setLastName("Gupta");
		
		session.persist(employee);
		transaction.commit();
		System.out.println("Data has been saved");
		
		
	}	
}