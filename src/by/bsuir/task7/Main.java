package by.bsuir.task7;

public class Main {

    private static final double[] ARRAY = {2, 5, -3, 0, 1, -6.5};

    public static void main(String[] args) {
        printArray(ShellSorting.sort(ARRAY));
    }

    private static void printArray(double[] array) {
        for (double element: array) {
            System.out.printf("%.1f ", element);
        }
        System.out.printf("\n");
    }
}
