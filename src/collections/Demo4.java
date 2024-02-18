package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(Files.readAllLines(Paths.get("src/data.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
