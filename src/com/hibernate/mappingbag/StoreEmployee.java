package com.hibernate.mappingbag;

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
		contact1.setPhoneNumber(111222L);
		contact1.setType("Office");
		
		ContactDetails contact2=new ContactDetails();
		contact2.setPhoneNumber(555555L);
		contact2.setType("Home");
		
		ArrayList<ContactDetails> contactList=new ArrayList<ContactDetails>();
		contactList.add(contact1);
		contactList.add(contact2);
		
		Employee employee=new Employee();
		employee.setContact(contactList);
		employee.setFirstName("Vikas");
		employee.setLastName("Gupta");
		
		session.persist(employee);
		transaction.commit();
		System.out.println("Data has been saved");
		
		
	}	
}