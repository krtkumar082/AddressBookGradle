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
	addressBookFileIOService.writeData(contactList);
	addressBookFileIOService.readData();
}
}

