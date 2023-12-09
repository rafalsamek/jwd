package classes;

/**
 * Napisz program, który oblicza pierwiastek kwadratowy z liczby podanej jako argument programu.
 * Uruchom program z wiersza poleceń.
 * Przykład
 *
 * java SquareRootApp 16
 * 4.0
 */
public class SquareRootApp {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        System.out.println(Math.sqrt(a));
    }
}
