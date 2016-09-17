package by.bsuir.task6;

public class Main {

    private static final double[] ARRAY = {2, 6, 2 , 8, 1};

    public static void main(String[] args) {
        double[][] matrix = Matrix.generate(ARRAY);
        for (double[] line: matrix) {
            for (double element: line) {
                System.out.printf("%f ", element);
            }
            System.out.printf("\n");
        }
    }
}
