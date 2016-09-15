package by.bsuir.implementation.task2;

import javafx.scene.shape.Rectangle;

public class GraphArea {

    private static final Rectangle[] subareas = {
            new Rectangle(-4, 6, 8, 6),
            new Rectangle(-6, 0, 12, 3)
    };

    public static boolean containsPoint(double x, double y) {
        return (subareas[0].contains(x, y) | subareas[1].contains(x, y));
    }
}
