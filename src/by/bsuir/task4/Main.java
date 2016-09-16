package by.bsuir.task4;

public class Main {

    private static final int[] ARRAY = {-2, 3, 4, 2, 3, 3, 0, 13};

    public static void main(String[] args) {
        int[] indexes = PrimeNumbersHelper.selectIndexes(ARRAY);
        for (int index : indexes) {
            System.out.printf("%d ", index);
        }
    }
}
