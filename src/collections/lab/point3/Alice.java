package collections.lab.point3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Mając do dyspozycji plik tekstowy z angielską wersją książki “Przygody Alicji w Krainie Czarów” alice30.txt wyznacz:
 * <p>
 * liczbę różnych wyrazów użytych w książce (pomiń znaki interpunkcyjne oraz cyfry),
 * literę na jaką zaczyna się najwięcej (różnych) wyrazów.
 */

public class Alice {
    private static final String FILE_PATH = "src/collections/lab/point3/alice30.txt";

    public static void main(String[] args) {
        List<String> allLines = loadTextFile(FILE_PATH);
        if (allLines != null) {
            Set<String> words = divideIntoWordsAndClean(allLines);
            System.out.println("Liczba różnych wyrazów w książce: " + words.size());

            Map<Character, Integer> firstLetterStats = createFirstLetterStats(words);
            Map.Entry<Character, Integer> mostCommonFirstLetter = findMostCommonFirstLetter(firstLetterStats);
            System.out.println(firstLetterStats);
            System.out.println("Litera na jaką zaczyna się najwięcej wyrazów to \"" + mostCommonFirstLetter.getKey() +
                    "\", jest ich " + mostCommonFirstLetter.getValue());
        }
    }

    private static List<String> loadTextFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
        }

        return null;
    }

    private static Set<String> divideIntoWordsAndClean(List<String> allLines) {
        Set<String> words = new TreeSet<>();
        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }

        return words;
    }

    private static String cleanWord(String word) {
        return word.replaceAll("\\p{Punct}|\\d", "");
    }

    private static Map<Character, Integer> createFirstLetterStats(Set<String> words) {
        Map<Character, Integer> firstLetterStats = new TreeMap<>();
        for (String word : words) {
            Character firstLetter = word.charAt(0);
            firstLetterStats.put(firstLetter, firstLetterStats.getOrDefault(firstLetter, 0) + 1);
        }

        return firstLetterStats;
    }

    private static Map.Entry<Character, Integer> findMostCommonFirstLetter(Map<Character, Integer> firstLetterStats) {
        Map.Entry<Character, Integer> mostCommonFirstLetterEntry = null;
        for (Map.Entry<Character, Integer> entry : firstLetterStats.entrySet()) {
            if (mostCommonFirstLetterEntry == null || entry.getValue() > mostCommonFirstLetterEntry.getValue()) {
                mostCommonFirstLetterEntry = entry;
            }
        }

        return mostCommonFirstLetterEntry;
    }
}
