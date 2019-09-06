package solutions;

import java.util.Arrays;

/**
 * Given two integer arrays, find out if the sum of any two entries, one from each 
 * array, equal a given integer value.
 * 
 */
public class DoArraysContainSum {
	
	/**
	 * Checks if sum value can be found in two arrays of integer.
	 * @param a array of integers
	 * @param b array if integers
	 * @param v sum value to check for
	 * @return true if found, false if not found
	 */
	public boolean sumFoundInArrays(int[] a, int[] b, int v) {
		Arrays.sort(a);
		Arrays.sort(b);
				
		for (int x=0;x<a.length;x++) {
			for (int y=0;y<b.length;y++) {

				if (a[x]+b[y]>v) {
					break;
				}
				if ((a[x]+b[y])==v) {
					return true;
				}

			}
		}
		return false;
	}

}
