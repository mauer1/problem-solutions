package solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {

    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    void testExample1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, solution.trap(height));
    }

    @Test
    void testExample2() {
        int[] height = {4,2,0,3,2,5};
        assertEquals(9, solution.trap(height));
    }

    @Test
    void testEmpty() {
        assertEquals(0, solution.trap(new int[]{}));
    }

    @Test
    void testSingleBar() {
        assertEquals(0, solution.trap(new int[]{5}));
    }

    @Test
    void testNoWater() {
        int[] height = {1,2,3,4,5};
        assertEquals(0, solution.trap(height));
    }

    @Test
    void testAllFlat() {
        int[] height = {3,3,3,3};
        assertEquals(0, solution.trap(height));
    }
}