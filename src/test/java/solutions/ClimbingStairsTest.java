package solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    public void testExample1() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void testExample2() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void testN1() {
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    public void testN0() {
        assertEquals(1, solution.climbStairs(0));
    }

    @Test
    public void testLargeN() {
        assertEquals(8, solution.climbStairs(5));
    }
}
