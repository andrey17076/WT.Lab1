package by.bsuir.task5;

public class Main {

    private static final int[] ARRAY = {1, 2, 3, 6, 7, 8, 4, 1, 2, 3};

    public static void main(String[] args) {
        int elementsAmount = LongestIncreasingSequence.getMinimalAmountOfRemovingElementsToObtain(ARRAY);
        System.out.print(elementsAmount);
    }
}
