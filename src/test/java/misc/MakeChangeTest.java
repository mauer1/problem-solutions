package misc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MakeChangeTest {

	@Test
	public void testChange() {
		String result = MakeChange.change(75, 0);
		String expected = "25 (3) 10 (0) 5 (0) 1 (0)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

	@Test
	public void testChange2() {
		String result = MakeChange.change(76, 0);
		String expected = "25 (3) 10 (0) 5 (0) 1 (1)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

	@Test
	public void testChange3() {
		String result = MakeChange.change(107, 0);
		String expected = "25 (4) 10 (0) 5 (1) 1 (2)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

	@Test
	public void testChange4() {
		String result = MakeChange.change(118, 0);
		String expected = "25 (4) 10 (1) 5 (1) 1 (3)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

	@Test
	public void testChange5() {
		String result = MakeChange.change(1, 0);
		String expected = "25 (0) 10 (0) 5 (0) 1 (1)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

	@Test
	public void testChange6() {
		String result = MakeChange.change(7, 0);
		String expected = "25 (0) 10 (0) 5 (1) 1 (2)";
		System.out.println(result);
		assertTrue(result.contentEquals(expected));
	}

}
