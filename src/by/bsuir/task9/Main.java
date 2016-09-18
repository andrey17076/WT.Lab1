package by.bsuir.task9;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    private static final ArrayList<Ball> balls = new ArrayList<>();

    static {
        balls.add(new Ball(Color.BLUE, 4));
        balls.add(new Ball(Color.BLUE, 3));
        balls.add(new Ball(Color.BLACK, 3));
    }

    public static void main(String[] args) {
        Basket basket = new Basket(balls);
        System.out.println("Blue balls count: " + basket.getBlueBallsCount());
        System.out.println("Basket weight: " + basket.getWeight());
    }
}
