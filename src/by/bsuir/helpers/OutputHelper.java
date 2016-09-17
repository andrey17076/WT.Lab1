package by.bsuir.helpers;

public class OutputHelper {

    public static void printDoubleArray(double[] array) {
        for (double element: array) {
            System.out.printf("%.1f ", element);
        }
        System.out.printf("\n");
    }
}
