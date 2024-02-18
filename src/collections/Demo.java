package collections;

import com.one.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //95% przypadków
        numbers.add(123);
        numbers.add(3);
        numbers.add(44);
        numbers.add(3);


        System.out.println(numbers.size());
        System.out.println(numbers.get(0));

        numbers.remove(0);
        System.out.println(numbers.get(0));

        numbers.remove((Integer) 3);

        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

        List<String> names = new ArrayList<>();

        names.add("Staszek");
        names.add("Wiola");
        names.add("Kasia");
        names.add("Marta");

        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(new Object());
        list.add("Ala");

        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println();

        System.out.println((int) list.get(0) + (String) list.get(2));

        System.out.println();

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(45);
        numbers1.add(345);

        System.out.println();

        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println("Liczba: " + numbers1.get(i));
        }

        System.out.println();

        for (Integer number : numbers1) {
            System.out.println("Liczba: " + number);
        }

        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Liczba: " + iterator.next());
        }

        System.out.println();

        ListIterator<Integer> listIterator = numbers1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Liczba: " + listIterator.next());
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println("Liczba: " + value + " ma indeks: " + index);
        }
    }
}
