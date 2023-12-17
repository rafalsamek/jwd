package mysandbox.chatgpt;

import java.util.Random;

public class ChristmasTreeProgram {

    public static void main(String[] args) {
        // Sprawdzenie, czy podano argument
        int height;
        if (args.length > 0) {
            // Jeśli podano argument, parsuj wysokość
            try {
                height = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format liczby. Używam domyślnej wartości 18.");
                height = 18;
            }
        } else {
            // Jeśli nie podano argumentu, użyj domyślnej wysokości
            height = 18;
        }

        // Wygeneruj i wyświetl choinkę
        generateAndDisplayChristmasTree(height);
    }

    private static void generateAndDisplayChristmasTree(int height) {
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            // Wypełnij spacjami na początku
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Wypełnij losowymi znakami
            for (int j = 0; j < 2 * i + 1; j++) {
                char randomChar = getRandomChar(random);
                System.out.print(randomChar);
            }

            // Przejdź do nowej linii po każdym wierszu
            System.out.println();
        }
    }

    private static char getRandomChar(Random random) {
        char[] charSet = {'+', '.', '*', '~', '^', 'o'};
        int randomIndex = random.nextInt(charSet.length);
        return charSet[randomIndex];
    }
}

