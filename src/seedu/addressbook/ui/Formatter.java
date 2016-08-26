package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_GOODBYE;
import static seedu.addressbook.common.Messages.MESSAGE_INIT_FAILED;
import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

import java.util.List;

public class Formatter {
	/** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();
    
    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";
    
	private static final String DIVIDER = "===================================================";
	
	/** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;
	
	
	public Formatter() {
		
	}
	
	public String formatString(String toBeFormatted, String... strings) {
		return toBeFormatted.format(toBeFormatted, strings);
	}
	
	public String[] formatWelcomeMessage(String version, String storageFileInfo) {
		return new String[]{
			DIVIDER,
            DIVIDER,
            MESSAGE_WELCOME,
            version,
            MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
            storageFileInfo,
            DIVIDER
		};
	}
	
	public String[] formatGoodbyeMessage() {
		return new String[]{
			MESSAGE_GOODBYE, 
			DIVIDER, 
			DIVIDER
		};
	}
	
	public String[] formatInitFailedMessage() {
		return new String[] {
			MESSAGE_INIT_FAILED, 
			DIVIDER,
			DIVIDER
		};
	}
	
	public String formatOutputString(String message) {
		return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
	}
	
	public String[] formatFeedbackString(String feedback) {
		return new String[]{
				feedback,
				DIVIDER
		};
	}
	
	/** Formats a list of strings as a viewable indexed list. */
    public String formatIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(formatIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }
	
	/**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    public String formatIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
    
    public String formatPromptForCommand() {
    	return LINE_PREFIX + "Enter command: ";
	}
}
