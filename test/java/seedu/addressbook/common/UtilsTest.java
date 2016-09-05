package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void one_object_null() {
		assertTrue(Utils.isAnyNull("Not null", "Not null either", null, "This is not null"));
	}
	
	@Test
	public void more_than_one_object_null() {
		assertTrue(Utils.isAnyNull("Not null", null, "Not null either", null, "This is not null"));
	}
	
	@Test
	public void no_object_null() {
		assertFalse(Utils.isAnyNull("Not null", "Not null either", "This is not null"));
	}
	
	@Test
	public void single_object_null() {
		assertTrue(Utils.isAnyNull(null));
	}
	
	@Test
	public void single_object_not_null() {
		assertFalse(Utils.isAnyNull("Not null"));
	}
	
	@Test
	public void all_unique_int() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList(new int[]{1, 2, 3})));
	}
	
	@Test
	public void all_unique_str() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList(new String[]{"Abc", "Def", "Ghi"})));
	}
	
	@Test
	public void singleton_list() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList(new int[]{1})));
	}
	
	@Test
	public void two_elems_same_int() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new int[]{1, 2, 2, 3})));
	}
	
	@Test
	public void two_and_two_elems_same_int() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new int[]{1, 2, 2, 3, 4, 4, 5})));
	}

	@Test
	public void three_elems_same_int() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new int[]{1, 2, 2, 2, 4, 5})));
	}

	@Test
	public void two_elems_same_str() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new String[]{"A", "B", "B", "C", "D"})));
	}
	
	@Test
	public void two_and_two_elems_same_str() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new String[]{"A", "B", "B", "C", "D", "D"})));
	}
	
	@Test
	public void three_elems_same_str() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new String[]{"A", "B", "B", "B", "C", "D"})));
	}
}
