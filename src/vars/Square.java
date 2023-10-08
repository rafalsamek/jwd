package vars;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    private double calculateCircut() {
        return 4 * side;
    }

    private double calculateField() {
        return side * side;
    }

    private double calculateDiagonal() {
        return Math.sqrt(2) * side;
    }

    public void printDetails() {
        System.out.println("Kwadrat o boku: " + side);
        System.out.println("Obwód: " + this.calculateCircut());
        System.out.println("Pole: " + this.calculateField());
        System.out.println("Przekątna: " + this.calculateDiagonal());
    }
}
