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
	
    /**
     * Format a string using the given arguments
     * @param toBeFormatted the String that will be formatted
     * @param strings the arguments to format using
     * @return formatted String
     */
	public String formatString(String toBeFormatted, String... strings) {
		return String.format(toBeFormatted, strings);
	}
	
	/**
	 * @param version
	 * @param storageFileInfo
	 * @return formatted welcome message for display
	 */
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
	
	/**
	 * @return formatted goodbye message for display
	 */
	public String[] formatGoodbyeMessage() {
		return new String[]{
			MESSAGE_GOODBYE, 
			DIVIDER, 
			DIVIDER
		};
	}
	
	/**
	 * @return formatted initialization failed message for display
	 */
	public String[] formatInitFailedMessage() {
		return new String[] {
			MESSAGE_INIT_FAILED, 
			DIVIDER,
			DIVIDER
		};
	}
	
	/**
	 * @param message
	 * @return message formatted into a more user readable format
	 */
	public String formatOutputString(String message) {
		return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
	}
	
	/**
	 * @param feedback
	 * @return formatted feedback for display
	 */
	public String[] formatFeedbackString(String feedback) {
		return new String[]{
				feedback,
				DIVIDER
		};
	}
	
	/**
	 * @return formatted prompt to user to enter a command
	 */
	public String formatPromptForCommand() {
		return LINE_PREFIX + "Enter command: ";
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
}
