package homeworks.homework4.point2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Napisz program, który prosi użytkownika o podanie indeksu tablicy
 * a następnie wyświetla wartość znajdującą się pod tym indeksem.
 * Obsłuż przypadek, gdy indeks jest poza zakresem tablicy, wyświetlając komunikat "Indeks poza zakresem!"
 * oraz przypadek, gdy wprowadzone dane nie są liczbą całkowitą, wyświetlając komunikat "Wprowadź poprawny indeks!".
 */
public class ArrayTester {
    public static void main(String[] args) {
        // Jakaś tablica
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};

        // Napisz program, który prosi użytkownika o podanie indeksu tablicy
        System.out.print("Podaj index tablicy\n");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        try {
            // a następnie wyświetla wartość znajdującą się pod tym indeksem.
            int index = parseInt(in);
            String value = stringArray[index];
            System.out.println("Wartość tablicy pod indeksem " + index + " to " + value);
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Obsłuż przypadek, gdy indeks jest poza zakresem tablicy, wyświetlając komunikat "Indeks poza zakresem!"
            System.out.println("Indeks poza zakresem!");
        } catch (NumberFormatException exception) {
            // oraz przypadek, gdy wprowadzone dane nie są liczbą całkowitą, wyświetlając komunikat "Wprowadź poprawny indeks!".
            System.out.println("Wprowadź poprawny indeks!");
        }
    }
}
