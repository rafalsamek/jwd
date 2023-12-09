package tests.test2;

/**
 * Napisz program przechowujący w pamięci 30 liczb całkowitych. Ustaw pierwszą liczbę na wartość większą od zera.
 * Każda kolejna liczba powinna być trzy razy większa od poprzedniej. Wyświetl przechowywane liczby na ekranie.
 *
 * Przykład:
 * 1
 * 3
 * 9
 * 27
 * ...
 */
public class ThirtyNumbers {
    public static void main(String[] args) {
        int[] thirtyNumbers = new int[30];
        int value = 2;
        for (int i = 0; i < thirtyNumbers.length; i++) {
            thirtyNumbers[i] = value;
            value += 3;

            System.out.println(thirtyNumbers[i]);
        }
    }
}
