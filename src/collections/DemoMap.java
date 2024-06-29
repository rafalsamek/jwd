package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "123-234-5678");
        phones.put("Alicja", "223-234-5678");
        phones.put("Tomek", "323-234-5678");
        phones.put("Barbara", "423-234-5678");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Barbara"));

        System.out.println(phones.get("Tomek"));
        System.out.println(phones.get("Barbara"));
        System.out.println(phones.get("Dupa"));

        for (String key : phones.keySet()) {
            System.out.println(key + " -" + phones.get(key));
        }

        for (String value : phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " ->" + entry.getValue());
//            entry.setValue("0");
        }
    }
}
