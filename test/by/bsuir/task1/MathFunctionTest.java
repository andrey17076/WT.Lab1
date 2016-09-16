package by.bsuir.task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MathFunctionTest {

    private static final double DELTA = 0.000001;
    private double passingX;
    private double passingY;
    private double expectingData;

    public MathFunctionTest(double passingX, double passingY, double expectingData) {
        this.passingX = passingX;
        this.passingY = passingY;
        this.expectingData = expectingData;
    }

    @Parameters
    public static List<Double[]> computingCorrectnessTestData() {
        return Arrays.asList(new Double[][]{
                {0.0, 0.0, 0.5},
                {1.0, -1.0, 1.5},
                {0.0, 1.0, 0.854037},
                {1.0, 0.0, 1.569358},
                {1.0, 1.0, 1.913411},
                {2.5, 1.9, 2.944411},
                {-123.0, -9.0, -122.991977},
                {4321.0, 1234.0, 4321.000319}
        });
    }

    @Test
    public void testComputingCorrectness() {
        double actualResult = MathFunction.computeValue(passingX, passingY);
        assertEquals(expectingData, actualResult, DELTA);
    }
}