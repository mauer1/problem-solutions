package solutions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringReverseTest {

	@Test
	public void test() {
		String reversed = StringReverse.reverse("abcd");
		String expected = "dcba";
		assertTrue(reversed.contentEquals(expected));
	}

	@Test
	public void test2() {
		String reversed = StringReverse.reverse("abcd123");
		String expected = "321dcba";
		assertTrue(reversed.contentEquals(expected));
	}

}
