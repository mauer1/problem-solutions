package solutions;

/**
 * Reverse a string, no library.
 *
 */
public class StringReverse {

	public static String reverse(String in) {
		return in.length() == 0 ? ""
				: in.substring(in.length() - 1, in.length()).concat(reverse(in.substring(0, in.length() - 1)));
	}

}
