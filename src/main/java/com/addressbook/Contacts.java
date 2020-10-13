package com.addressbook;
import java.util.stream.Collectors;
public class Contacts {
    public String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private long phoneNumber;
    private String email;
     
    public Contacts() {
    	
    }
    
    public Contacts(String firstName,String lastName,String address,String city,String state,String zip,long phoneNumber,String email) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.address=address;
    	this.city=city;
    	this.state=state;
    	this.zip=zip;
    	this.phoneNumber=phoneNumber;
    	this.email=email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Long getPhone() {
		return phoneNumber;
	}
	public void setPhone(Long phone) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "First Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip: "+zip+"\nPhone Number: "+phoneNumber+"\nEmail: "+email+"\n\n";
	}
    
}
