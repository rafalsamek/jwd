package overloading;

/**
 * Napisz program Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
 * Przykład
 *
 * Calculator calc = new Calculator();
 * int res1 = calc.add(1, 2);
 * double res2 = calc.add(1.0, 2.4, 3.4);
 */
public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        System.out.println(res1);

        double res2 = calc.add(1.0, 2.4, 3.4);
        System.out.println(res2);
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
