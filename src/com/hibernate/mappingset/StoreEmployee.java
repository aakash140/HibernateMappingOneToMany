package com.hibernate.mappingset;

import java.util.TreeSet;

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
		contact1.setPhoneNumber(22223333L);
		contact1.setType("Mobile");
		
		ContactDetails contact2=new ContactDetails();
		contact2.setPhoneNumber(6666666L);
		contact2.setType("Res");
		
		TreeSet<ContactDetails> contactList=new TreeSet<ContactDetails>();
		contactList.add(contact1);
		contactList.add(contact2);
		System.out.println(contactList);
		
		Employee employee=new Employee();
		employee.setContact(contactList);
		employee.setFirstName("Aakash");
		employee.setLastName("Gupta");
		
		session.persist(employee);
		transaction.commit();
		System.out.println("Data has been saved");
	}	
}