package homeworks.homework1.point2;

public class Calculator {
    public static void main(String[] args) {
        int a = 7;
        int b = 34;

        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println( a + " - " + b + " = " + subtract(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " / " + b + " = " + divide(a, b));
    }

    private static int add(int a, int b) {
        return  a + b;
    }

    private static int subtract(int a, int b) {
        return  a - b;
    }

    private static  int multiply(int a, int b) {
        return  a * b;
    }

    private static int divide(int a, int b) {
        return  a / b;
    }
}
