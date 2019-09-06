package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountLaunchCodesTest {

	CountLaunchCodes solution = new CountLaunchCodes();

	@Test
	public void testNumberOfUniqueLaunchCodes() {
		String[] codes = { "abc", "cba", "qrs", "srq", "gab", "rzp", "123" };
		assertEquals(5, solution.numberOfUniqueLaunchCodes(codes));

		String[] codes2 = { "abc", "cba" };
		assertEquals(1, solution.numberOfUniqueLaunchCodes(codes2));

		String[] codes3 = { "car", "car", "car", "rac", "rac" };
		assertEquals(1, solution.numberOfUniqueLaunchCodes(codes3));

		String[] codes4 = { "123", "321", "abc", "cba", "rac" };
		assertEquals(3, solution.numberOfUniqueLaunchCodes(codes4));
	}

}
