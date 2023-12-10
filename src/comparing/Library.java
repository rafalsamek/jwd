package comparing;

public class Library {
    Book[] books;

    public static void main(String[] args) {
        Library library = new Library();
        library.books = new Book[3];

        library.books[0] = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", "PWN", 1980);
        library.books[1] = new Book("Potop", "Henryk Sienkiewicz", "PWN", 1981);
        library.books[2] = new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", "PWN", 1982);

        System.out.println("Książka " + library.books[0] + " i " + library.books[1] + " są takie same? " + library.books[0].equals(library.books[1]));
    }
}
