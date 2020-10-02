package com.service;
import com.addressbook.Contacts;
public interface PersonService {
 
	public Contacts createPerson();
	
	public void updatePerson(Contacts personContact);
	
	public void displayPerson(Contacts personContact);
}
