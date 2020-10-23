package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressbookIOServiceMain {
	public static void main(String[] args) {
	AddressBookIOService addressBookFileIOService = new AddressBookIOService();
	List<Contacts> contactList = new ArrayList<>();
	Contacts contact1 = new Contacts("Kirti", "Kumar", "sik", "sik", "raj", "331313", "91 9999999999", "abc@google.com");
	Contacts contact2 = new Contacts("Deepak", "Kumar", "sik", "sik", "raj", "332315", "91 8888888888", "abc@gmail.com");
	Contacts contact3 = new Contacts("Kk", "Fenin", "jap", "jap", "raj", "332316", "91 7777777777", "asdf@yahoo.com");
	contactList.add(contact1);
	contactList.add(contact2);
	contactList.add(contact3);
	addressBookFileIOService.writeCSVData(contactList);
	addressBookFileIOService.readCSVData();
	
	List<Contacts> readList =addressBookFileIOService.readCSVData();
	System.out.println("Contacts read from the file are:");
	for(Contacts contact : readList) {
		System.out.println(contact);
	}
	System.out.println(readList.size());
	
	addressBookFileIOService.writeJson(contactList);
	addressBookFileIOService.readJson();
}
}

