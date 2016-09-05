package seedu.addressbook.association;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Association class between Person and Tags to represent tags that are added or
 * deleted during a certain session
 * 
 * @author varungupta
 *
 */
public class Tagging {
	private enum Type {
		ADDED, DELETED
	};

	public final Type type;
	public final Person person;
	public final Tag tag;

	public Tagging(Type type, Person person, Tag tag) {
		this.type = type;
		this.person = person;
		this.tag = tag;
	}

	@Override
	public String toString() {
		return type == Type.ADDED ? "+" : "-" + " "
			   + person.getName() + " "
			   + tag.toString();
	}
}
