package lambda;

import java.util.ArrayList;
import java.util.List;

public class ListElementRemover {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(11);
        list.add(null);
        list.add(null);

        System.out.println(list);

        list.removeIf(e -> e == null);

        System.out.println(list);
    }
}
