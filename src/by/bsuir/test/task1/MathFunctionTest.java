package by.bsuir.test.task1;

import by.bsuir.implementation.task1.MathFunction;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MathFunctionTest {

    private class TestData {
        double passingX, passingY, expectingData;

        TestData(double passingX, double passingY, double expectingData) {
            this.passingX = passingX;
            this.passingY = passingY;
            this.expectingData = expectingData;
        }
    }

    private final List<TestData> countingCorrectnessTestData = Arrays.asList(
            new TestData(0.0, 0.0, 0.5),
            new TestData(1.0, -1.0, 1.5),
            new TestData(0.0, 1.0, 0.854037),
            new TestData(1.0, 0.0, 1.569358),
            new TestData(1.0, 1.0, 1.913411),
            new TestData(2.5, 1.9, 2.944411),
            new TestData(-123.0, -9.0, -122.991977),
            new TestData(4321.0, 1234.0, 4321.000319)
    );

    @Test
    public void testCountingCorrectness() {
        for (TestData testingData : countingCorrectnessTestData) {
            double actualResult = MathFunction.count(testingData.passingX, testingData.passingY);
            assertTrue(Math.abs(testingData.expectingData - actualResult) < 0.000001);
        }
    }
}