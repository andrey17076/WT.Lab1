package by.bsuir.implementation.task1;

import java.util.Scanner;

public class MathFunction {

    private static final Scanner INPUT = new Scanner(System.in);

    public static double computeValue(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }

    public static void main(String[] args) {
        double x = getArgument("x");
        double y = getArgument("y");
        System.out.printf("Function value = %.5f", computeValue(x, y));
    }

    private static double getArgument(String argument) {
        System.out.printf("Enter %s: ", argument);
        return INPUT.nextDouble();
    }
}
