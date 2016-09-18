package by.bsuir.task9;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class BasketTest {

    private Basket basket;

    @Before
    public void prepareData() {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Color.BLUE, 4.4));
        balls.add(new Ball(Color.BLUE, 2.6));
        balls.add(new Ball(Color.BLACK, 3));
        this.basket = new Basket(balls);
    }

    @Test
    public void testWeightCounting() {
        assertTrue(basket.getWeight() == 10);
    }

    @Test
    public void testBlueBallsCounting() {
        assertTrue(basket.getBlueBallsCount() == 2);
    }

}