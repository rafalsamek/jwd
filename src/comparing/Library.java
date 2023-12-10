package comparing;

/**
 * Napisz program porównujący książki, w tym celu:
 * stwórz klasę Book, posiadającą pola title, author, publisher, year
 * stwórz klasę, Library przechowującą tablicę obiektów Book
 * wprowadź do tablicy kilka egzemplarzy Book
 * zademonstruj porównywanie książek
 * wyświetl szczegóły porównywanych książek
 */
public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Ogniem i mieczem", "Henryk Sienkiewicz", "PWN", 1980),
                new Book("Potop", "Henryk Sienkiewicz", "PWN", 1981),
                new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", "PWN", 1982)
        };

        System.out.println("Książka " + books[0] + " i " + books[1] + " są takie same? " + books[0].equals(books[1]));
    }
}
