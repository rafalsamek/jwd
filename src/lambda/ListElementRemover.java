package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListElementRemover {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(11);
        list.add(null);
        list.add(null);

        System.out.println(list);

        list.removeIf(Objects::isNull);

        System.out.println(list);
    }
}
