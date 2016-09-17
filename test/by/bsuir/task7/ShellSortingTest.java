package by.bsuir.task7;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class ShellSortingTest {

    private static double[] PASSING_ARRAY;

    @Before
    public void preparePassingArray() {
        Random random = new Random();
        PASSING_ARRAY = new double[random.nextInt(1000) + 1000];
        for (int i = 0; i < PASSING_ARRAY.length; i++) {
            PASSING_ARRAY[i] = random.nextDouble() * random.nextInt();
        }
    }

    @Test
    public void testSorting() {
        double[] actualArray = ShellSorting.sort(PASSING_ARRAY);
        for (int i = 0; i < actualArray.length - 1; i++) {
            assertTrue(actualArray[i] <= actualArray[i + 1]);
        }
    }

}