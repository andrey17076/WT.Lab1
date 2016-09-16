package by.bsuir.task3;

import java.util.LinkedHashMap;

public class Main {

    private static final double domainLeftBorder = -Math.PI;
    private static final double domainRightBorder = Math.PI;
    private static final double step = 0.1;

    public static void main(String[] args) {
        if ((domainLeftBorder < domainRightBorder) && (step > 0))
            performComputing();
        else
            System.out.println("Incorrect data!");
    }

    private static void performComputing() {
        LinkedHashMap<Double, Double> values = TangentFunction.getValues(domainLeftBorder, domainRightBorder, step);
        values.forEach((argument, value) -> System.out.printf("%.5f -> %.5f\n", argument, value));
    }
}
