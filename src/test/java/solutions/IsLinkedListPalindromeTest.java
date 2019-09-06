package solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solutions.IsLinkedListPalindrome.ListItem;

public class IsLinkedListPalindromeTest {

	IsLinkedListPalindrome solution = new IsLinkedListPalindrome();

	@Test
	public void testIsLinkedListPalindrome() {
		ListItem<String> item = getTestListOne();
		assertTrue(solution.isLinkedListPalindrome(item));
	}

	@Test
	public void testIsLinkedListPalindromeTwo() {
		ListItem<String> item = getTestListTwo();
		assertFalse(solution.isLinkedListPalindrome(item));
	}

	private ListItem<String> getTestListOne() {
		ListItem<String> test1 = solution.new ListItem<String>("A");
		ListItem<String> test2 = solution.new ListItem<String>("B");
		test1.next = test2;

		ListItem<String> test3 = solution.new ListItem<String>("B");
		test2.next = test3;

		ListItem<String> test4 = solution.new ListItem<String>("A");
		test3.next = test4;

		return test1;
	}

	private ListItem<String> getTestListTwo() {
		ListItem<String> test1 = solution.new ListItem<String>("C");
		ListItem<String> test2 = solution.new ListItem<String>("A");
		test1.next = test2;

		ListItem<String> test3 = solution.new ListItem<String>("R");
		test2.next = test3;

		return test1;
	}

}
