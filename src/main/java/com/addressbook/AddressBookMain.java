package com.addressbook;
import java.util.*;
import com.service.AddressBookService;
import com.impl.AddressBookServiceImpl;
import com.addressbook.AddressBook;
import java.util.stream.Collectors;


public class AddressBookMain {
	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		AddressBooks addressBooks = new AddressBooks();
		AddressBookService addressBookService = new AddressBookServiceImpl(sc);
		System.out.println("Welcome to AddressBook");
		while (true) {
			System.out.println("1.) Open an existing Address book");
			System.out.println("2.) Create new Address Book");
			System.out.println("3.) Search Contact by city");
			System.out.println("4.) Search Contact by state");
			System.out.println("5.) count Contact by city");
			System.out.println("6.) count Contact by state");
			System.out.println("7.) Exit");
			int options = sc.nextInt();

			switch (options) {
			case 1:
			openExistingAddressBook(addressBookService, addressBooks,sc);
				break;
			case 2:
				createNewAddressBook(addressBookService, addressBooks, sc);
				break;
			case 3:System.out.println("Enter city name");
			       String city=sc.next();
			       addressBooks.searchByCity(city);
			       break;
			       
			case 4:System.out.println("Enter state name");
		           String state=sc.next();
		          addressBooks.searchByState(state);
		          break;
			case 5:System.out.println("Enter city name");
		       	   String city1=sc.next();
		       	   addressBooks.countByCity(city1);
		       	   break;
		       
			case 6:System.out.println("Enter state name");
	           	   String state1=sc.next();
	           	   addressBooks.countByState(state1);
	           	   break;
			case 7:
				System.out.println("Bye\n\n");
				return;
			default:
				break;
			}
		}

	}
	
	public static void openExistingAddressBook(AddressBookService addressBookService,AddressBooks addressBooks,Scanner sc) {
		System.out.print("Enter Name");
		String name = sc.next();
		AddressBook addressBook = addressBooks.containdAddressBook(name);
		if(Objects.nonNull(addressBook)) {
			addressBookService.showOptions(addressBook);
			return;
	}
		System.out.println("Not Address Book Found");
	}
	
	public static void createNewAddressBook(AddressBookService addressBookService,AddressBooks addressBooks ,Scanner sc) {
		System.out.print("Enter Name");
		String name = sc.next();
		AddressBook addressBook = addressBookService.createAddressBook(name);
		addressBooks.addAddressBook(addressBook);
		System.out.print("Created\n\n");
	}
	
	}


