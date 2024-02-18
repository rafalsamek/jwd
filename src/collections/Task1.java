package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * zadanie
 * utwórz listę 100 elementów (liczb całkowitych) od 1 do 100
 * wyświetl listę
 * usuń co 3 element
 * wyświetl listę
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(120);
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 3 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
