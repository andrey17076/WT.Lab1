package by.bsuir.task4;

import by.bsuir.helpers.ListHelper;

import java.util.ArrayList;

class PrimeNumbersHelper {

    static int[] selectIndexes(int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i]))
                indexes.add(i);
        }
        return ListHelper.toArray(indexes);
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
}
