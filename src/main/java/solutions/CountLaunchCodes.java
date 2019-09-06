package solutions;

import java.util.HashSet;

/**
 * It is widely known that codes and their reverse will both work to "launch".
 * Eg ABC and CBA will work. Knowing this, find the number of "unique" launch
 * codes in a list.
 * 
 */
public class CountLaunchCodes {

	/**
	 * Checks an array of strings for unique launch codes as defined in question
	 * 
	 * @param codes array of launch code strings
	 * @return number of unique launch codes
	 */
	public int numberOfUniqueLaunchCodes(String[] codes) {
		HashSet<String> set = new HashSet<String>();
		for (String code : codes) {
			if (!set.contains(new StringBuilder(code).reverse().toString())) {
				set.add(code);
			}
		}
		return set.size();
	}

}
