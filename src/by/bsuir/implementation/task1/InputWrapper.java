package by.bsuir.implementation.task1;

import java.util.Scanner;

public class InputWrapper {

    private static final Scanner INPUT = new Scanner(System.in);

    public static double getArgument(String argument) {
        System.out.printf("Enter %s: ", argument);
        return INPUT.nextDouble();
    }
}
