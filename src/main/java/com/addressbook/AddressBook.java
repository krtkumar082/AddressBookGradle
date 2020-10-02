package com.addressbook;
import java.util.*;

public class AddressBook {
    private String name;
    private List<Contacts> contacts;
    
    public AddressBook(String name) {
    	this.name=name;
    	contacts=new ArrayList<Contacts>();
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void addPersoncontact(Contacts c) {
		contacts.add(c);
	}
	public void display() {
		for(int i=0;i<contacts.size();i++) {
			System.out.println("Contact details of person " +i+1+ " is \n" +contacts.get(i));
			System.out.println("\n");
		}
	}
}
