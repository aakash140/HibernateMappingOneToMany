package com.hibernate.mappingset;

/**
 * 
 * @author aakash.gupta
 *
 */
public class ContactDetails implements Comparable<ContactDetails> {

	private int contact_id;
	private long phoneNumber;
	private String type;
	
	public int compareTo(ContactDetails contact){
		//return this.contact_id-contact.contact_id;
		return 1;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
}