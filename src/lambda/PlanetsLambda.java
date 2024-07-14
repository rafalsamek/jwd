package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {
                "Merkury",
                "Wenus",
                "Ziemia",
                "Mars",
                "Jowisz",
                "Saturn",
                "Uran",
                "Neptun"
        };

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        Arrays.sort(planets, comparator);

        System.out.println(Arrays.toString(planets));
    }
}
