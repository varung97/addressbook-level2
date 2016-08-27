package seedu.addressbook.data.person;

/**
 * Represents a person's street in the address book
 * @author varungupta
 */
public class Street {
	private final String value;
	
	public Street(String street) {
		this.value = street;
	}
	
	public String getValue() {
		return value;
	}
}
