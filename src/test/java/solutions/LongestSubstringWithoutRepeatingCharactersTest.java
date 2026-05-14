package solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testExample1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void testAllUnique() {
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }
}