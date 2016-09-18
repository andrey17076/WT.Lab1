package by.bsuir.task8;

import java.util.Arrays;

class Merger {

    static int[] getInsertedElementsIndexes(double[] destination, double[] inserting) {
        int[] insertedElementsIndex = new int[inserting.length];
        for (int i = 0; i < inserting.length; i++) {
            int foundIndex = Arrays.binarySearch(destination, inserting[i]);
            insertedElementsIndex[i] = (foundIndex >= 0) ? foundIndex + 1 : Math.abs(foundIndex) - 1;
        }
        return insertedElementsIndex;
    }
}
