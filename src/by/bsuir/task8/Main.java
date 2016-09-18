package by.bsuir.task8;

public class Main {

    private static final double[] DESTINATION_ARRAY = {1, 2, 4};
    private static final double[] INSERTING_ARRAY = {2, 3, 5};

    public static void main(String[] args) {
        int[] indexes = Merger.getInsertedElementsIndexes(DESTINATION_ARRAY, INSERTING_ARRAY);
        for (int element: indexes) {
            System.out.printf(element + " ");
        }
        System.out.printf("\n");
    }
}
