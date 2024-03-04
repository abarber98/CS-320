import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	// test contact creation
	@Test
	void testContactCalss() {
		Contact newContact = new Contact("1001", "Desmond", "Hume", "17068675309", 
				"915 Oregano Ct Conyers, GA 30094");
		assertTrue(newContact.getFirstName().equals("Desmond"));
		assertTrue(newContact.getLastName().equals("Hume"));
		assertTrue(newContact.getId().equals("1001"));
		assertTrue(newContact.getPhone().equals("17068675309"));
		assertTrue(newContact.getAddress().equals("915 Oregano Ct Conyers, GA 30094"));
	}
	// test invalid ID length
	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10000000000", "Desmond", "Hume", "17068675309", 
				"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for null ID
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Desmond", "Hume", "17068675309", 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for invalid first name length
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond123456", "Hume", "17068675309", 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for null first name
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", null, "Hume", "17068675309",
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for invalid last name length
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", "Hume123456", "17068675309", 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for null last name
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", null, "17068675309", 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for not exactly 10 characters
	@Test
	void testContactClassPhoneNot10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", "Hume", "706867530", 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for null phone
	@Test
	void testContactCalssPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", "Hume", null, 
					"915 Oregano Ct Conyers, GA 30094");
		});
	}
	// test for invalid address length
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", "Hume", "17068675309", 
					"915 Oregano Ct Conyers, GA 30094 123456");
		});
	}
	// test for null address
	@Test
	void testContactClassAddressnull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10001", "Desmond", "Hume", "17068675309", 
					null);
		});
	}
	// test fName setter method
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		newContact.setFirstName("Shepardy");
		assertTrue(newContact.getFirstName().equals("Shepardy"));
	}
	@Test
	void testContactClassSetFirstNameTooLong() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("ShepardyTooLong");
		});
	}
	@Test
	void testContactClassSetFirstNameNull() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
		});
	}
	// test lName setter method
	@Test
	void testContactClassSetLastName() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		newContact.setLastName("Shepardy");
		assertTrue(newContact.getLastName().equals("Shepardy"));
	}
	@Test
	void testContactClassSetLastNameTooLong() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("ShepardyTooLong");
		});
	}
	@Test
	void testContactClassSetLastNameNull() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName(null);
		});
	}
	// test phone setter method
	@Test
	void testContactClassSetPhone() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		newContact.setPhone("6618886119");
		assertTrue(newContact.getPhone().equals("6618886119"));
	}
	@Test
	void testContactClassSetPhoneTooLong() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("66188861199999999");
		});
	}
	@Test
	void testContactClassSetPhoneNull() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone(null);
		});
	}
	@Test
	void testContactClassSetPhoneTooShort() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("44444");
		});
	}
	// test address setter method
	@Test
	void testContactClassSetAddress() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		newContact.setAddress("new address 2");
		assertTrue(newContact.getAddress().equals("new address 2"));
	}
	@Test
	void testContactClassSetAddressTooLong() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress("new address too long 1324566874685");
		});
	}
	@Test
	void testContactClassSetAddressNull() {
		Contact newContact = new Contact("845", "Jack", "Shepard", "17068675309", "new address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
		});
	}
	

}