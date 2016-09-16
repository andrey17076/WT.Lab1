package by.bsuir.task4;

import java.util.ArrayList;

public class Main {

    private static final int[] ARRAY = {-2, 3, 4, 2, 3, 3, 0, 13};

    public static void main(String[] args) {
        int[] indexes = selectPrime(ARRAY);
        for (int index : indexes) {
            System.out.printf("%d ", index);
        }
    }

    static int[] selectPrime(int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i]))
                indexes.add(i);
        }
        return toArray(indexes);
    }

    private static boolean isPrime(int number)
    {
        if (number == 2)
            return true;
        if ((number % 2 == 0) || (number <= 1))
            return false;
        boolean result = true;
        for (int i = 3; i <= (int) Math.sqrt(number) && result; i += 2){
            result = (number % i != 0);
        }
        return result;
    }

    private static int[] toArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
