package collections.lab.point2;

import java.util.HashMap;
import java.util.Map;

/**
 * Napisz program o nazwie UserCollector zarządzający
 * (przechowuje całą kolekcję, wyświetla wybrane pozycje)
 * obiektami typu User za pomocą unikalnych identyfikatorów.
 * Obiekty User powinny zawierać takie właściwości jak imię, nazwisko oraz wiek.
 */
public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Rafael", "Nadal", 25));
        users.put(2, new User("Romania", "Nadal", 26));
        users.put(3, new User("Jan", "Kowalski", 57));

        // sposób 1:
        System.out.println(users.get(1));
        System.out.println(users.get(3));

        // sposób 2:
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // sposób 3:
        for (User user : users.values()) {
            System.out.println(user);
        }
    }
}
