package homeworks.homework4.point1;

/**
 * Napisz interfejs Operation z metodą double execute(double a, double b),
 * która wykonuje operację na dwóch liczbach i zwraca wynik.
 * Zaimplementuj ten interfejs w klasach Addition (dodawanie) i Multiplication (mnożenie).
 */
public class OperationTester {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        System.out.println("7 + 4 = " + addition.execute(7, 4));
        System.out.println("7 * 4 = " + multiplication.execute(7, 4));
    }
}
