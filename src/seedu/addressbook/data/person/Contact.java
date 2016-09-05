package seedu.addressbook.data.person;

/**
 * Represents a Person's Contact details in the addressbook. Not meant to be
 * used directly, but rather meant to be subclassed.
 * 
 * @author varungupta
 */
public class Contact {
	protected String value;
	protected boolean isPrivate;

	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public String getValue() {
		return value;
	}
}
