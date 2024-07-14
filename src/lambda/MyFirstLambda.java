package lambda;

// x -> x * x
// <lista parametrów> -> <ciało wyrażenia>
// (Integer x, Long y) -> System.out.println(x * y)
// (Integer x) -> {if (x > 2) return x else return 0);

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(2));
        System.out.println(multiplier.perform(5));
        System.out.println(multiplier.perform(10));

        Introducer introducer = name -> System.out.println("Cześć! Mam na imię " + name + ".");
        introducer.run("Rafał");

        System.out.println();

        // korzystamy z gotowych interfaców funkcyjnych
        UnaryOperator<Integer> uo = o -> o * o;
        System.out.println(uo.apply(2));

        Consumer<String> consumer = name -> System.out.println("Cześć! Mam na imię " + name + ".");
        consumer.accept("Rafał");
    }
}

@FunctionalInterface
interface Multiplier {
    int perform(int x);
}

@FunctionalInterface
interface Introducer {
    void run(String name);
}
