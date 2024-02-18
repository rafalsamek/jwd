package collections.lab.point1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Mając do dyspozycji plik z książką w formacie tekstowym crsto10.txt wykonaj poniższe polecenia:
 * wczytaj do listy wszystkie wiersze książki “Hrabia Monte Christo”,
 * wyznacz liczbę wszystkich wierszy, tworząc metodę, która przyjmuje obiekty typu List i zwraca liczbę typu int (liczba elementów listy),
 * napisz metodę, która wyświetli na ekranie co setny wiersz książki,
 * napisz metodę, która znajdzie i wyświetli najdłuższy wers z książki wielkimi literami.
 */
public class BookReader {
    public static void main(String[] args) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("src/collections/lab/point1/crsto10.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Liczba wierszy to: " + countListElements(lines));

        System.out.println("Co setny wiersz książki to: ");
        printEvery100Line(lines);

        System.out.println("Najdłuższy wers książki to: ");
        findLongestLine(lines);
    }

    private static int countListElements(List list) {
        return list.size();
    }

    private static void printEvery100Line(List lines) {
        for (int i = 1; i <= lines.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(lines.get(i - 1));
            }
        }
    }

    private static void findLongestLine(List<String> lines) {
        int longestSize = 0;
        String longestLine = "";
        for (int i = 0; i < lines.size(); i++) {
            int lineLength = lines.get(i).length();
            if (lineLength > longestSize) {
                longestLine = lines.get(i);
                longestSize = lineLength;
            }
        }
        System.out.println(longestLine);
    }
}
