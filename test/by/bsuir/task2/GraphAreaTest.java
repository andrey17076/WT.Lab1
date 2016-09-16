package by.bsuir.task2;

import by.bsuir.task2.GraphArea;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphAreaTest {

    @Test
    public void testPointInArea() {
        assertTrue(GraphArea.containsPoint(0, 2));
        assertTrue(GraphArea.containsPoint(2, -2));
    }

    @Test
    public void testPointOnBorderBetweenSubareas() {
        assertTrue(GraphArea.containsPoint(0, 0));
        assertTrue(GraphArea.containsPoint(-3, 0));
    }

    @Test
    public void testPointOnBorderOfArea() {
        assertTrue(GraphArea.containsPoint(6, -3));
        assertTrue(GraphArea.containsPoint(4, 0));
    }

    @Test
    public void testPointOutsideArea() {
        assertFalse(GraphArea.containsPoint(-3, -4));
        assertFalse(GraphArea.containsPoint(-6, 3));
    }
}
