package homeworks.homework2.point1;

/**
 * Napisz program, który:
 * stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
 * wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
 * wyświetli zawartość tablicy,
 * dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie (ciąg malejący: n, n-1, n-2… 1),
 * wyświetli zawartyość przekonwertowanej tablicy,
 * fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako oddzielne metody.
 */
public class ArrayConverter {
    public static void main(String[] args) {
        int n = parseArgs(args);
        int[] array = initializeArray(n);
        fillArray(array);
        System.out.println("Array:");
        showArray(array);
        reverseArray(array);
        System.out.println("Reversed array:");
        showArray(array);
    }

    private static int parseArgs(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("Missing array size in the program parameters!");
        }
        return Integer.parseInt(args[0]);
    }

    private static int[] initializeArray(int n) {
        return new int[n];
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private static void showArray(int[] array) {
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }

    private static void reverseArray(int[] array) {
        int index = 0;
        int reversedIndex = array.length - 1;
        int value;
        while(index < reversedIndex) {
            value = array[index];
            array[index] = array[reversedIndex];
            array[reversedIndex] = value;
            index++;
            reversedIndex--;
        }
    }
}
