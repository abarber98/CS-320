

public class Contact {
	// variable declaration
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		// check for null in contactID
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// check for null in firstName
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// check for null in lastName
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// check for null and invalid length in number 
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		// check address for null and length
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		// handling if requirements are met
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// getter methods
	public String getId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	// setter methods for use by ContactService
	public void setFirstName(String fName) {
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Ivalid First Name");
		}
		this.firstName = fName;
	}
	public void setLastName(String lName) {
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lName;
	}
	public void setPhone(String newPhone) {
		if (newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Inavlid Phone Number");
		}
		this.phone = newPhone;
	}
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = newAddress;
	}
}