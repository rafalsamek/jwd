package collections.lab.point3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Mając do dyspozycji plik tekstowy z angielską wersją książki “Przygody Alicji w Krainie Czarów” alice30.txt wyznacz:
 *
 * liczbę różnych wyrazów użytych w książce (pomiń znaki interpunkcyjne oraz cyfry),
 * literę na jaką zaczyna się najwięcej (różnych) wyrazów.
 */
public class BookStats {
    public static void main(String[] args) {
        // read the file and create a map word -> count, omit punctuation and digits
        String filePath = "src/collections/lab/point3/alice30.txt";
        Map<String, Integer> wordsWithCount = loadWordsWithCountFromFile(filePath);

        // show the map
        for (Map.Entry<String, Integer> entry : wordsWithCount.entrySet()) {
            System.out.println("słowo \"" + entry.getKey() + "\" wystąpiło " + entry.getValue() + " razy.");
        }

        // find most common letter
        Map.Entry<Character, Integer> mostCommonFirstLetterWithCount = findMostCommonFirstLetterWithCount(wordsWithCount);
        System.out.println("Litera na jaką zaczyna się najwięcej (różnych) wyrazów użytych w książce to: " +
                mostCommonFirstLetterWithCount.getKey());
        System.out.println("Liczba różnych wyrazów zaczynających się na \"" +
                mostCommonFirstLetterWithCount.getKey() + "\" to: " + mostCommonFirstLetterWithCount.getValue());

        System.out.println("Stastyki wszystkich liter: " + getFirstLettersCount(wordsWithCount.keySet()));
    }

    private static Map<String, Integer> loadWordsWithCountFromFile(String filePath) {
        Map<String, Integer> wordsWithCount = new HashMap<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                line = line.replaceAll("[^A-Za-z']", " ").toLowerCase();
                for (String word : line.split(" ")) {
                    if (!word.replaceAll("'", "").isEmpty()) {
                        wordsWithCount.put(word, wordsWithCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania pliku: " + e.getMessage());
        }

        return new TreeMap<>(wordsWithCount); // sorted alphabetically by key
    }


    private static Map.Entry<Character, Integer> findMostCommonFirstLetterWithCount(Map<String, Integer> wordsWithCount) {
        Map<Character, Integer> lettersCount = getFirstLettersCount(wordsWithCount.keySet()); // unique words
        Map.Entry<Character, Integer> mostCommonFirstLetterWithCount = new AbstractMap.SimpleEntry<>(null, 0);

        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            if (entry.getValue() > mostCommonFirstLetterWithCount.getValue()) {
                mostCommonFirstLetterWithCount = new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue());
            }
        }

        return mostCommonFirstLetterWithCount;
    }

    private static Map<Character, Integer> getFirstLettersCount(Set<String> words) {
        Map<Character, Integer> lettersCount = new HashMap<>();
        for (String word : words) {
            Character firstLetter = word.charAt(0);
            if (firstLetter != '\'') {
                lettersCount.put(firstLetter, lettersCount.getOrDefault(firstLetter, 0) + 1);
            }
        }

        return new TreeMap<>(lettersCount); // sorted
    }
}
