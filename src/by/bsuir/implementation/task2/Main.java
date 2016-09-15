package by.bsuir.implementation.task2;

import by.bsuir.implementation.task1.InputWrapper;

public class Main {

    public static void main(String[] args) {
        double x = InputWrapper.getArgument("x");
        double y = InputWrapper.getArgument("y");
        System.out.print(GraphArea.containsPoint(x, y));
    }
}
