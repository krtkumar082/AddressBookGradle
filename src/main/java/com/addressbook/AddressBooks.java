package com.addressbook;
import com.addressbook.AddressBook;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBooks {
private List<AddressBook> addressBooks;
AddressBook book=new AddressBook();
	
	public AddressBooks() {
		addressBooks = new ArrayList<>();
	}
	
	public void  addAddressBook(AddressBook addressBook) {
		addressBooks.add(addressBook);
	}
	
	public AddressBook containdAddressBook(String name)
	{
		for(int i =0 ;i<addressBooks.size();i++) {
			if(addressBooks.get(i).getName().equals(name)) {
				return addressBooks.get(i);
			}
			
		}
		return null;
	}
	public void searchByCity(String city){
		 addressBooks.stream().forEach(n->{
			n.getContactList().stream()
			              .filter(n1->n1.getCity().equalsIgnoreCase(city)).forEach(n1->{
			            	  System.out.println(n1);
			            	  });
	});
		 System.out.println("if no contacts above then no contact exist with this city");
	}
	public void searchByState(String state){
		addressBooks.stream().forEach(n->{
			n.getContactList().stream()
			              .filter(n1->n1.getState().equalsIgnoreCase(state)).forEach(n1->{
			            	  System.out.println(n1);
			            	  });
	});
		 System.out.println("if no contacts above then no contact exist with this state");
	}
}
