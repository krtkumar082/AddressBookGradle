package com.addressbook;
import java.util.*;

public class AddressBookMain {
	public static Contacts creatContact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=sc.nextLine();
		System.out.println("Enter last name");
		String lname=sc.nextLine();
		System.out.println("Enter address");
		String address=sc.nextLine();
		System.out.println("Enter city");
		String city=sc.nextLine();
		System.out.println("Enter state");
		String state=sc.nextLine();
		System.out.println("Enter zip");
		String zip=sc.nextLine();
		System.out.println("Enter phone number");
	    long phoneNumber=sc.nextLong();
	    System.out.println("Enter email");
	    String email=sc.next();
	    Contacts c1=new Contacts(fname,lname,address,city,state,zip,phoneNumber,email);
	    return c1;	
	}
  public static void main(String[] args) {
	System.out.println("Welcome to Address Book");
	Contacts c=creatContact();
	AddressBook book=new AddressBook("B1");
	book.addPersoncontact(c);
	book.display();
	
}
}
