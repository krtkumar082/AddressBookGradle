package com.impl;

import java.util.Scanner;
import java.util.Objects;

import com.addressbook.AddressBook;
import com.addressbook.Contacts;
import com.service.PersonService;
import com.service.AddressBookService;

public class AddressBookServiceImpl implements AddressBookService {
	private AddressBook addressBook;
	private PersonService personService;
	private Scanner sc;

	public AddressBookServiceImpl(Scanner sc) {
		this.sc = sc;
	}

	public void showOptions(AddressBook addressBook) {
		this.addressBook = addressBook;
		personService = new PersonServiceImpl(this.sc);

		System.out.println("Option For Address Book");

		System.out.println("1.) Find A Person");
		System.out.println("2.) Update A Person");
		System.out.println("3.) Create A Person");
		System.out.println("4.) Exit");

		int option = sc.nextInt();
		switch (option) {

		case 1:
			  	findAPerson();
			  	break;
		case 2:
				updateAPerson();
				break;
		case 3:
				createAPerson();
				break;
		case 4:
				return;
		default:
			System.out.println("Invalid Entry");
			break;

		}
	}

	@Override
	public void findAPerson() {
		System.out.println("Enter Person Name");
		String name = sc.next();
		personService.displayPerson(addressBook.isPersonContain(name));
	}

	@Override
	public void updateAPerson() {
		System.out.println("Enter Person Name");
		String name = sc.next();
		Contacts person = addressBook.isPersonContain(name);
		if (Objects.nonNull(person)) {
			personService.updatePerson(person);
			return;
		}
		System.out.println("Person Not Found");
	}

	public void createAPerson() {
		addressBook.addPersoncontact(personService.createPerson());
	}

	

}
