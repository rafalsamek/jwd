package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinqe", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        Set<Chair> furniture = new HashSet<Chair>();
        furniture.add(chair1);
        furniture.add(chair2);
        furniture.add(chair3);
        furniture.add(chair4);

        System.out.println(furniture);
        furniture.remove(new Chair("Adde", "IKEA", 2016));
        System.out.println(furniture);
    }
}
