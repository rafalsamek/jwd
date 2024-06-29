package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("aaa");
        words.add("bbb");
        words.add("bbb");
        words.add("ccc");

        System.out.println(Collections.frequency(words, "bbb"));

        System.out.println(words);
        Collections.shuffle(words);
        System.out.println(words);
    }
}
