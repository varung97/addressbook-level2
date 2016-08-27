package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

	public static final String EXAMPLE = "";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses need to be in the form BLOCK, STREET, UNIT, POSTAL_CODE";
	public static final String ADDRESS_VALIDATION_REGEX = ".+?, .+?, .+?, .+";

	public final Block block;
	public final Street street;
	public final Unit unit;
	public final PostalCode postalCode;
	private boolean isPrivate;

	/**
	 * Validates given address.
	 *
	 * @throws IllegalValueException
	 *             if given address string is invalid.
	 */
	public Address(String address, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidAddress(address)) {
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}
		String[] parts = address.split(", ");
		this.block = new Block(parts[0]);
		this.street = new Street(parts[1]);
		this.unit = new Unit(parts[2]);
		this.postalCode = new PostalCode(parts[3]);
	}

	/**
	 * Returns true if a given string is a valid person email.
	 */
	public static boolean isValidAddress(String test) {
		return test.matches(ADDRESS_VALIDATION_REGEX);
	}
	
	public String getValue() {
		return block.getValue() + ", " + street.getValue() + ", " + unit.getValue() + ", " + postalCode.getValue();
	}

	@Override
	public String toString() {
		return this.getValue();
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Address // instanceof handles nulls
						&& this.getValue().equals(((Address) other).getValue())); // state
																		// check
	}

	@Override
	public int hashCode() {
		return this.getValue().hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}