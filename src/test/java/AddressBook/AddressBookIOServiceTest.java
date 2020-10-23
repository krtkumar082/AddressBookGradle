package AddressBook;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.addressbook.AddressBookIOService;
import com.addressbook.Contacts;

public class AddressBookIOServiceTest {
	@Test
	public void writeContactsToFile() {
		AddressBookIOService addressBookFileIOService = new AddressBookIOService();
		List<Contacts> list = new ArrayList<>();
		Contacts contact1 = new Contacts("Kirti", "Kumar", "btd", "btd", "btd", "331313", "91 9999999999", "abc@google.com");
		Contacts contact2 = new Contacts("Test", "Test", "test", "test", "test", "987345", "91 8888888888", "abc@gmail.com");
		Contacts contact3 = new Contacts("Test1", "Test", "test", "test", "test", "987345", "91 8888888888", "abc@gmail.com");
		list.add(contact1);
		list.add(contact2);
		list.add(contact3);
		addressBookFileIOService.writeData(list);
		addressBookFileIOService.readData();
		Assert.assertEquals(3, addressBookFileIOService.countEntries());
	}
}
