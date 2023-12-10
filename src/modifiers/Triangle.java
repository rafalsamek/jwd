package modifiers;

public class Triangle extends Shape {
    private int base;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    private int height;

    @Override
    public double getArea() {
        return (double) (base * height) / 2;
    }
}
