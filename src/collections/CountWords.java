package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolne słowa (w -> wyjście):");

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if(word.equals("w")) {
                break;
            }
            words.add(word);
        }

        System.out.println(words.size() + " unikalnych słow");
    }
}
