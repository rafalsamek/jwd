package lambda.lab.point2;

import java.util.ArrayList;
import java.util.List;

/**
 * Napisz metodę działającą na liście liczb całkowitych.
 * Jej zadaniem będzie wyświetlenie tylko elementów listy podzielnych przez 3.
 * Skorzystaj z metody forEach, wywołanej na obiekcie listy.
 */
public class IntegerListDevidableByThree {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(33);
        integerList.add(44);
        integerList.add(55);
        integerList.add(66);

        integerList.forEach(i -> {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        });
    }
}
