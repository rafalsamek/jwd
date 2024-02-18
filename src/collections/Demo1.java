package collections;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(120);
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        Integer[] array = new Integer[numbers.size()];

        for (Integer number : array) {
            System.out.println(number);
        }

        array = numbers.toArray(array);

        for (Integer number : array) {
            System.out.println(number);
        }

        Integer[] array1 = numbers.toArray(new Integer[numbers.size()]);
        for (Integer number : array1) {
            System.out.println(number);
        }
    }
}
