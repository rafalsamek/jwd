package homeworks.homework3.point1;

/**
 * Utwórz klasę o nazwie Rectangle posiadającą dwie właściwości (długość i szerokość)
 * oraz metodę określającą pole powierzchni. Klasa powinna posiadać trzy konstruktory:
 * bez parametrowy - wartościom zarówno długości, jak i szerokości przypisuje się zero,
 * z dwoma parametrami - dwie liczby są przypisane odpowiednio jako długość i szerokość,
 * z jednym parametrem - zarówno długość, jak i szerokość otrzymują tą samą wartość.
 * Utwórz obiekty klasy Rectangle, korzystając ze wszystkich utworzonych konstruktorów
 * i wyświetl ich pola powierzchni.
 */
public class Rectangle {
    private double width;
    private  double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    public double calculateField() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Pole powierzchni prostokąta1 to: " + rectangle1.calculateField());

        Rectangle rectangle2 = new Rectangle(7, 4);
        System.out.println("Pole powierzchni prostokąta2 to: " + rectangle2.calculateField());

        Rectangle rectangle3 = new Rectangle(12);
        System.out.println("Pole powierzchni prostokąta3 to: " + rectangle3.calculateField());
    }
}
