package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(120);
        for (int i = 1; i <= 10 ; i++) {
            numbers.add(i);
        }
//        System.out.println(numbers);
//        List<Integer> allNumbers = new ArrayList<>();

//        allNumbers.addAll(numbers);
//        allNumbers.addAll(numbers);
//        allNumbers.addAll(numbers);
//        allNumbers.addAll(numbers);
//
//        System.out.println(allNumbers);
//        System.out.println();

        int index = numbers.lastIndexOf(6);
        numbers.set(index, 99);

        System.out.println(numbers);
    }
}
