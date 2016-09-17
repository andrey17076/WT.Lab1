package by.bsuir.task7;

import by.bsuir.helpers.OutputHelper;

public class Main {

    private static final double[] ARRAY = {2, 5, -3, 0, 1, -6.5};

    public static void main(String[] args) {
        OutputHelper.printDoubleArray(ShellSorting.sort(ARRAY));
    }
}
