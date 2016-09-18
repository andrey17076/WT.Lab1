package by.bsuir.task8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergerTest {

    private static final double[] DESTINATION_ARRAY = {1, 2, 3, 6};
    private static final double[] INSERTING_ARRAY = {-2, 2, 4, 9};
    private static final int[] EXPECTING_INDEXES = {0, 2, 3, 4};

    @Test
    public void testIndexFinding() {
        int[] actualIndexes = Merger.getInsertedElementsIndexes(DESTINATION_ARRAY, INSERTING_ARRAY);
        assertArrayEquals(EXPECTING_INDEXES, actualIndexes);
    }
}