package collections.lab.point1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {
        MonteChristo monteChristo = new MonteChristo();
        List<String> allLines = monteChristo.loadTestFile("src/crsto10.txt");

        if (allLines != null && !allLines.isEmpty()) {
            System.out.println("Wczytany plik zawiera " + monteChristo.countLines(allLines));
        }

        monteChristo.showEveryHundredLine(allLines);
        monteChristo.showTheLongestVers(allLines);
    }

    List<String> loadTestFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get("src/crsto10.txt"));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    int countLines(List list) {
        return list.size();
    }

    void showEveryHundredLine(List list) {
        System.out.println();
        for (int i = 1; i <= list.size(); i++) {
            if (i % 100 == 0) {
                System.out.println(i + " " + list.get(i - 1));
            }
         }
    }

    void showTheLongestVers(List<String> list) {
        String longestLine = "";
        for (String line : list) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("\nNajdłuższy wers książki zawiera " + longestLine.length() + " znaki/ków - " + longestLine.toUpperCase());
    }
}
