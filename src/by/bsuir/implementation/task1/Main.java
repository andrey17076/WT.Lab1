package by.bsuir.implementation.task1;

public class Main {

    public static void main(String[] args) {
        double x = InputWrapper.getArgument("x");
        double y = InputWrapper.getArgument("y");
        System.out.printf("Function value = %.5f", MathFunction.computeValue(x, y));
    }
}
