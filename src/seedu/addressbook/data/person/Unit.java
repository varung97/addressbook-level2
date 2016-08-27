package seedu.addressbook.data.person;

/**
 * Represents a person's unit number in the address book
 * @author varungupta
 */
public class Unit {
	private final String value;
	
	public Unit(String unit) {
		this.value = unit;
	}
	
	public String getValue() {
		return value;
	}
}
