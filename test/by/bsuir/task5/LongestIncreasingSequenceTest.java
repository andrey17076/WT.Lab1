package by.bsuir.task5;

import by.bsuir.helpers.ListHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LongestIncreasingSequenceTest {

    private int expectingValue;
    private int[] passingArray;

    public LongestIncreasingSequenceTest(int expectingValue, List<Integer> passingArray) {
        this.expectingValue = expectingValue;
        this.passingArray = ListHelper.toArray(passingArray);
    }

    @Parameters
    public static List<Object[]> computingCorrectnessTestData() {
        return Arrays.asList(new Object[][] {
                {5, Arrays.asList( 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2)}, // {1, 12, 23, 52, 61, 69, 70}
                {3, Arrays.asList(10, 22, 9, 33, 21, 50, 41, 60, 80)}, // {10, 22, 33, 50, 60, 80}
                {3, Arrays.asList(-80, -60, -41, -50, -21, -33, -9, -22, -10)}
        });
    }

    @Test
    public void testComputingCorrectness() {
        assertEquals(LongestIncreasingSequence.getMinimalAmountOfRemovingElementsToObtain(passingArray), expectingValue);
    }
}


