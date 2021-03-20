package solutions;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Write a function that takes an integer parameter representing an amount in
 * cents, for which you need to make change. The function should return a string
 * of change denominations and counts.
 *
 */
public class MakeChange {

	static final int[] coins = new int[] { 1, 5, 10, 25 };

	public static String change(int cents, int coin_idx) {
		int[] sorted_coins = IntStream.of(coins).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
		return _change(cents, coin_idx, sorted_coins);
	}

	private static String _change(int cents, int coin_idx, int[] sorted_coins) {
		int count = 0;

		while (sorted_coins[coin_idx] <= cents) {
			count++;
			cents -= sorted_coins[coin_idx];
		}

		return String.format("%d (%d)", sorted_coins[coin_idx], count)
				.concat(coin_idx < 3 ? " " + _change(cents, ++coin_idx, sorted_coins) : "");
	}

}
