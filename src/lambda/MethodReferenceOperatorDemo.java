package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceOperatorDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        int number = function.apply("123");

        Consumer<String> printer = System.out::println; // method reference operator
        printer.accept("Hello!");
    }
}
