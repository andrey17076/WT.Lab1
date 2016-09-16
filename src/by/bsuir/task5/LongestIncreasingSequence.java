package by.bsuir.task5;

class LongestIncreasingSequence {

    static int getMinimalAmountOfRemovingElementsToObtain(int[] array) {
        int[] lis = getInitializedLISValues(array.length);
        int sequenceLength = findMaxValue(countOpimizedLISValues(array, lis));
        return array.length - sequenceLength;
    }

    private static int[] getInitializedLISValues(int length) {
        int[] lis = new int[length];
        for (int i = 0; i < length; i++ )
            lis[i] = 1;
        return lis;
    }

    private static int[] countOpimizedLISValues(int[] array, int[] lis) {
        for (int i = 1; i < array.length; i++ )
            for (int j = 0; j < i; j++ )
                if ( array[i] > array[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
        return lis;
    }

    private static int findMaxValue(int[] array) {
        int max = array[0];
        for (int element : array)
            if (element > max)
                max = element;
        return max;
    }
}
