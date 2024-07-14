package lambda;

import java.util.function.Function;

public class MethodReferenceOperatorDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> Integer.parseInt(s);
        int number = function.apply("123");
    }
}
