package by.bsuir.task9;

import java.awt.*;
import java.util.ArrayList;

class Basket {

    private double weight;
    private int blueBallsCount;

    Basket(ArrayList<Ball> balls) {
        balls.forEach((ball) -> {
            weight += ball.getWeight();
            if (ball.getColor().equals(Color.BLUE))
                blueBallsCount += 1;
        });
    }

    double getWeight() {
        return weight;
    }

    int getBlueBallsCount() {
        return blueBallsCount;
    }
}
