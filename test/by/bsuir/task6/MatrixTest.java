package by.bsuir.task6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {

    @Test
    public void testMatrixGeneration() {
        double[][] expectingMatrix = { {1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        double[][] actualMatrix = Matrix.generate(new double[] {1, 2, 3, 4});
        assertArrayEquals(expectingMatrix, actualMatrix);
    }
}