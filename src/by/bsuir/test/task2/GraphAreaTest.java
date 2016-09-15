package by.bsuir.test.task2;

import by.bsuir.implementation.task2.GraphArea;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphAreaTest {

    @Test
    public void testPointInArea() {
        assertTrue(GraphArea.containsPoint(0, 2));
    }

    @Test
    public void testPointOnBorderBetweenSubareas() {
        assertTrue(GraphArea.containsPoint(0, 0));
    }

    @Test
    public void testPointOnBorderOfArea() {
        assertFalse(GraphArea.containsPoint(6, -3));
    }

    @Test
    public void testPointOutsideArea() {
        assertFalse(GraphArea.containsPoint(-3, -4));
    }
}
