package by.bsuir.task1;

class MathFunction {

    static double computeValue(double x, double y) {
        double nominator = (1 + Math.pow(Math.sin(x + y), 2));
        double denominator = (2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2))));
        return nominator/denominator + x;
    }
}
