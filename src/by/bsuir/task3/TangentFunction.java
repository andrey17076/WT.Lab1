package by.bsuir.task3;

import java.util.LinkedHashMap;

class TangentFunction {

    static LinkedHashMap<Double, Double> getValues(double leftBorder, double rightBorder, double step) {
        LinkedHashMap<Double, Double> values = new LinkedHashMap<>();
        for (double i = leftBorder; i <= rightBorder; i += step) {
            values.put(i, Math.tan(i));
        }
        return values;
    }
}
