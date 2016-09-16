package by.bsuir.task3;

import java.util.LinkedHashMap;

public class Main {

    private static final double DOMAIN_LEFT_BORDER = -Math.PI;
    private static final double DOMAIN_RIGHT_BORDER = Math.PI;
    private static final double STEP = 0.1;

    public static void main(String[] args) {
        if ((DOMAIN_LEFT_BORDER < DOMAIN_RIGHT_BORDER) && (STEP > 0))
            performComputing();
        else
            System.out.println("Incorrect data!");
    }

    private static void performComputing() {
        LinkedHashMap<Double, Double> values = TangentFunction.getValues(DOMAIN_LEFT_BORDER, DOMAIN_RIGHT_BORDER, STEP);
        values.forEach((argument, value) -> System.out.printf("%.5f -> %.5f\n", argument, value));
    }
}
