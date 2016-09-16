package by.bsuir.task2;

public class GraphArea {

    private static final Area[] SUBAREAS = { new Area(-4, 5, 8, 5), new Area(-6, 0, 12, 3) };

    public static boolean containsPoint(double x, double y) {
        return (SUBAREAS[0].containsPoint(x, y) | SUBAREAS[1].containsPoint(x, y));
    }
}
