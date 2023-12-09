package overloading;

public class Adder {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }

    static int sum(int a, int b) {
        System.out.println("Suma dwóch liczb całkowitych");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("Suma trzech liczb całkowitych");
        return a + b + c;
    }
}
