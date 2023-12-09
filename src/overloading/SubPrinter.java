package overloading;

public class SubPrinter extends Printer {
    int z = 3;

    void printMe() {
        System.out.println("x=" + this.x + ", y=" + this.y + ", z=" + this.z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
