package enums.lab;

/**
 * Napisz typ wyliczeniowy Computation, który będzie reprezentował prosty kalkulator.
 * Niech typ ten posiada następujące wartości MULTIPLY, DIVIDE, ADD, SUBTRACT.
 * Niech typ ten posiada metodę public double perform(double x, double y), która zwróci wynik odpowiedniej operacji.
 * Na przykład Computation.ADD.perform(1, -5) powinno zwrócić -4.
 */
public class ComputationTester {
    public static void main(String[] args) {
        double x = 1;
        double y = -5;

        System.out.println("Wynik dodawania liczb " + x + " i " + y + " to: " + Computation.ADD.perform(x, y));
        System.out.println("Wynik odejmowania liczb " + x + " i " + y + " to: " + Computation.SUBTRACT.perform(x, y));
        System.out.println("Wynik mnożenia liczb " + x + " i " + y + " to: " + Computation.MULTIPLY.perform(x, y));
        System.out.println("Wynik dzielenia liczb " + x + " i " + y + " to: " + Computation.DIVIDE.perform(x, y));
    }
}
