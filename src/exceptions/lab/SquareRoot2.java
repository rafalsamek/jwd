package exceptions.lab;

import java.util.Scanner;

/**
 * Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
 * Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
 * Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
 * Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
 */
public class SquareRoot2 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();

        double number = 0;
        try {
            number = Double.parseDouble(inputLine);
        } catch (NumberFormatException e) {
            System.out.println("Podany ciąg znaków nie jest liczbą!");
            System.exit(-1);
        }

        if (number < 0) {
            throw new IllegalArgumentException("Podano liczbę ujemną!");
        }
        System.out.println("Pierwiastek z liczby " + number + " to: " + Math.sqrt(number));
    }
}
