package by.bsuir.implementation.task1;

public class MathFunction {

    public static double computeValue(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }
}
