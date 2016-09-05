package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	
	private Name name;

	@Before
	public void setup() throws IllegalValueException {
        name = new Name("John Smith");
    }
	
	@Test(expected= NullPointerException.class)
	public void null_name() throws IllegalValueException {
		name.isSimilar(new Name(null));
	}
	
	@Test(expected= IllegalValueException.class)
	public void empty_name() throws IllegalValueException {
		name.isSimilar(new Name(""));
	}
	
	@Test(expected= IllegalValueException.class)
	public void name_with_numbers() throws IllegalValueException {
		name.isSimilar(new Name("1231"));
	}
	
	@Test
	public void same_name() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("John Smith")));
	}
	
	@Test
	public void lowercase_name() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("john smith")));
	}

	@Test
	public void uppercase_name() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("JOHN SMITH")));
	}
	
	@Test
	public void mixedcase_name() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("JoHn smitH")));
	}
	
	@Test
	public void different_order() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Smith John")));
	}

	@Test
	public void different_order_mixed_case() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("SmIth joHn")));
	}
	
	@Test
	public void subset_order() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Smith")));
	}
}
