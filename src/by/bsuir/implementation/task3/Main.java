package by.bsuir.implementation.task3;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Double, Double> values = TangentFunction.getValues(-Math.PI, Math.PI, 0.1);
        values.forEach( (argument, value) -> System.out.printf("%.5f -> %.5f\n", argument, value));
    }
}
