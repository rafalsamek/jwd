package lambda;

// x -> x * x
// <lista parametrów> -> <ciało wyrażenia>
// (Integer x, Long y) -> System.out.println(x * y)
// (Integer x) -> {if (x > 2) return x else return 0);

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(2));
        System.out.println(multiplier.perform(5));
        System.out.println(multiplier.perform(10));
    }
}

interface Multiplier {
    int perform(int x);
}
