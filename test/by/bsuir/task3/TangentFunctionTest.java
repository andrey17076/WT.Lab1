package by.bsuir.task3;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class TangentFunctionTest {

    private static final double DELTA = 0.0001;
    private static final HashMap<Double, Double> CORRECT_TANGENT_VALUES = new HashMap<>();
    static {
        CORRECT_TANGENT_VALUES.put(0d, 0d);
        CORRECT_TANGENT_VALUES.put(Math.PI / 3, Math.sqrt(3));
        CORRECT_TANGENT_VALUES.put(2 * Math.PI / 3, -Math.sqrt(3));
        CORRECT_TANGENT_VALUES.put(Math.PI, 0d);
    }

    @Test
    public void testComputingCorrectness() {
        LinkedHashMap<Double, Double> computedValues = TangentFunction.getValues(0, Math.PI, Math.PI / 3);
        CORRECT_TANGENT_VALUES.forEach((argument, value)-> assertEquals(computedValues.get(argument), value, DELTA));
    }
}
