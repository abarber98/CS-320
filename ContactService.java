import java.util.ArrayList;

public class ContactService {
	
	// variable declaration
	public static String publicId;
	public String publicFirstName;
	public String publicLastName;
	public String publicPhone;
	public String publicAddress;
	
	// create structure for data storage
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	// generate unique Id
	public static String generateUniqueId() {
		// placeholder string
		String uniqueId;
		// default number
		if (contactList.isEmpty()) {
			publicId = "1000000001";
		}
		//gets the latest value, therefore highest, in the arraylist if it is not empty
		else {
			int arraySize = contactList.size();
			publicId = contactList.get(arraySize - 1).getId();
		}
		// convert string to int
		int tempInt = Integer.valueOf(publicId);
		// add 1 to make next value unique
		tempInt += 1;
		// convert back to string
		uniqueId = Integer.toString(tempInt);
		return uniqueId;
	}
	
	// creation of a Contact object and adding it to the arraylist
	public static void addContact(String fName, String lName, String phone, String address) {
		String ID = generateUniqueId();
		Contact Contact1 = new Contact(ID, fName, lName, phone, address);
		contactList.add(Contact1);
	}
	// add a contact for testing 
	public static void addContact(Contact newContact) {
		String tempId = newContact.getId();
		for (int i = 0; i < contactList.size(); i++) {
			if (tempId.equals(contactList.get(i).getId())) {
				throw new IllegalArgumentException("Contact ID Must Be Unique");
			}
		}
		contactList.add(newContact);
	}
	
	// updater methods
	public static void updateFirstName(String uniqueId, String publicFirstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setFirstName(publicFirstName);
			}
		}
	}
	public static void updateLastName(String uniqueId, String publicLastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setLastName(publicLastName);
			}
		}
	}
	public static void updatePhoneNum(String uniqueId, String publicPhone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setPhone(publicPhone);
			}
		}
	}
	public static void updateAddress(String uniqueId, String publicAddress) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setAddress(publicAddress);
			}
		}
	}
	// delete a contact from the list
	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				int position = i;
				// removes contact from list
				contactList.remove(position);
			}
		}
	}
	// quick search function for testing
	public static int searchContact(String uniqueId) {
		int result = 0;
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				result = 1;
			}
			else {
				result = 2;
			}
		}
		return result;
	}
	// quick find index function
	public static int findIndex(String uniqueId) {
		int result = 0;
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				result = i;
			}
		}
		return result;
	}
		
}