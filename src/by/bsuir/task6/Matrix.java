package by.bsuir.task6;

class Matrix {

    static double[][] generate(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(array, i, matrix[i], 0, array.length - i);
            System.arraycopy(array, 0, matrix[i], array.length - i, i);
        }
        return matrix;
    }
}
