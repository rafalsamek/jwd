package overloading;

public class Printer {
    int x = 0;
    int y = 1;

    void printMe() {
        System.out.println("x=" + this.x + ", y=" + this.y);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }
}
