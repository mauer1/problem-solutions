package solutions;

/**
 * Given a linked list (format supplied), write a method to determine if a
 * linked list is a palindrome.
 * 
 */
public class IsLinkedListPalindrome {

	public class ListItem<T> {
		T t;
		String value;
		ListItem<T> next;

		ListItem(String in) {
			value = in;
		}
	}

	/**
	 * Checks if supplied linked list (ListItem) is a palindrome
	 * 
	 * @param item linked list of strings
	 * @return true if list is palindrome, false if not
	 */
	public boolean isLinkedListPalindrome(ListItem<String> item) {

		ListItem<String> current = item;
		StringBuilder builder = new StringBuilder();
		builder.append(current.value);

		while (current.next != null) {
			builder.append(current.next.value);
			current = current.next;
		}

		return builder.toString().contentEquals(builder.reverse().toString());
	}

}
