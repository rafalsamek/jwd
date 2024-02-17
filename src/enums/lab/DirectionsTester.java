package enums.lab;

/**
 * Napisz typ wyliczeniowy z kierunkami świata (także pośrednimi, np. “north east”).
 * Typ powinien przechowywać informacje o skrótach (np. “NE”) oraz nazwach zarówno w języku angielskim oraz polskim.
 * Zademonstruj na przykładzie działanie nowego typu.
 */
public class DirectionsTester {
    public static void main(String[] args) {
        for (Directions direction : Directions.values()) {
            System.out.println(direction);
        }
    }
}
