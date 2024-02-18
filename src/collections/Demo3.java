package collections;

import java.util.LinkedList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10 ; i++) {
            numbers.add(i);
        }

        int index = numbers.lastIndexOf(6);
        numbers.set(index, 99);

        System.out.println(numbers);
    }
}
