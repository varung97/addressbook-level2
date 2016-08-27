package seedu.addressbook.data.person;

/**
 * Represents a person's block in the address book
 * @author varungupta
 */
public class Block {
	private final String value;
	
	public Block(String block) {
		this.value = block;
	}

	public String getValue() {
		return value;
	}
}
