package solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoArraysContainSumTest {

	DoArraysContainSum solution = new DoArraysContainSum();

	@Test
	public void testCheckForSum() {
		int[] a = { 3, 7, 0, 2, -1, -66 };
		int[] b = { 2, 1, 0, 15, 19, 100 };

		assertFalse(solution.sumFoundInArrays(a, b, 9000));
		assertTrue(solution.sumFoundInArrays(a, b, 2));
		assertTrue(solution.sumFoundInArrays(a, b, 17));
	}

	@Test
	public void testCheckForSum2() {
		int[] a = { 3, 7, 0, 2, -1, 100 };
		int[] b = { 2, 1, 0, 15, 19, -66 };

		assertTrue(solution.sumFoundInArrays(a, b, 34));
		assertTrue(solution.sumFoundInArrays(a, b, -66));
		assertTrue(solution.sumFoundInArrays(a, b, -67));
		assertTrue(solution.sumFoundInArrays(a, b, -63));
		assertTrue(solution.sumFoundInArrays(a, b, 0));
	}

	@Test
	public void testCheckForSum3() {
		int[] a = { 3 };
		int[] b = { 2, 1, 0, 15, 19, -66, 7, 12, -1, 100 };

		assertTrue(solution.sumFoundInArrays(a, b, 103));
		assertFalse(solution.sumFoundInArrays(a, b, 104));
		assertTrue(solution.sumFoundInArrays(a, b, 3));
		assertFalse(solution.sumFoundInArrays(a, b, 6));
		assertTrue(solution.sumFoundInArrays(a, b, 2));
	}

}
