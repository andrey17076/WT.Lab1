package by.bsuir.task4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    private static final int[][] PASSING_ARRAYS = {
            {7, -13, -7, -6, -1},
            {0, 1, 2},
            {2, 3, 3, 8, 13}
    };

    private static final int[][] EXPECTING_INDEXES = {
            {0},
            {2},
            {0, 1, 2, 4}
    };

    @Test
    public void testNegativeNumbers() {
        performTest(0);
    }

    @Test
    public void testDisputableCases() {
        performTest(1);
    }

    @Test
    public void testPrimalityChecking() {
        performTest(2);
    }

    private void performTest(int testNumber) {
        int[] actualIndexes = Main.selectPrime(PASSING_ARRAYS[testNumber]);
        assertArrayEquals(EXPECTING_INDEXES[testNumber], actualIndexes);
    }
}