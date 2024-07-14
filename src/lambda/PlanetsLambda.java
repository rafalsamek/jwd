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

        Arrays.sort(planets, Comparator.comparingInt(String::length));
        Arrays.asList(planets).forEach(System.out::println);
    }
}
