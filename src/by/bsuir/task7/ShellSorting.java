package by.bsuir.task7;

class ShellSorting {

    static double[] sort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
        return array;
    }
}
