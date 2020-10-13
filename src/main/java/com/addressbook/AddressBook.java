package com.addressbook;
import java.util.*;
import java.util.function.Predicate;
import com.addressbook.Contacts;
import java.util.stream.Collectors;
public class AddressBook {
    private String name;
    private List<Contacts> contacts;
    public AddressBook() {
    	
    }
    
    public AddressBook(String name) {
    	this.name=name;
    	contacts=new ArrayList<Contacts>();
    }
   

	public String getName() {
		return name;
	}
  public List<Contacts> getContactList(){
	  return contacts;
  }
  public List<Contacts> showAllContacts(){
		return getContactList().stream().sorted((n1,n2) -> n1.getFirstName().compareTo(n2.getFirstName())).collect(Collectors.toList());
	}
  
	public void setName(String name) {
		this.name = name;
	}
	public void addPersoncontact(Contacts c) {
		boolean present = contacts.stream().anyMatch(n -> n.getFirstName().equalsIgnoreCase(c.getFirstName()));
		if(present) {
			System.out.println("Already contact is present");
		}
		else
		contacts.add(c);
	}
	public Contacts isPersonContain(String firstName) {
		for(int i=0 ; i<contacts.size();i++) {
			 if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				 return contacts.get(i);
				 
			 }
		}
		return null;
	}
	
	public void  deletePerson(String firstName) {
		for(int i=0 ; i<contacts.size();i++) {
			 if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				 	contacts.remove(i);
				 	return;
			 }
		}
	}
	
	
	
}
