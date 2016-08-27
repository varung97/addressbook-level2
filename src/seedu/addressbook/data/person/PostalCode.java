package seedu.addressbook.data.person;

/**
 * Represents a person's postal code in the address book
 * @author varungupta
 */
public class PostalCode {
	private final String value;
	
	public PostalCode(String postalCode) {
		this.value = postalCode;
	}
	
	public String getValue() {
		return value;
	}
}
