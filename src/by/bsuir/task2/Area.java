package by.bsuir.task2;

class Area {

    private double baseX;
    private double baseY;
    private double weight;
    private double height;

     Area(double x, double y, double weight, double height) {
        this.baseX = x;
        this.baseY = y;
        this.weight = weight;
        this.height = height;
    }

    boolean containsPoint(double x, double y) {
        return (baseX <= x) && (x <= baseX + weight) && (baseY - height <= y) && (y <= baseY);
    }
}
