package overloading;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;

    int x2 = 0;
    int y2 = 0;

    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        return this;
    }

    Box buildBox(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;

        x2 = bottomRight.x;
        y2 = bottomRight.y;

        return this;
    }

    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;

        x2 = topLeft.x + w;
        y2 = topLeft.y + h;

        return this;
    }

    void printBox() {
        System.out.print("Box: <" + this.x1 + ", " + this.y1);
        System.out.print("; " + this.x2 + ", " + this.y2 + ">");
    }

    public static void main(String[] args) {
        Box rect = new Box();

        System.out.println("Tworzymy Box ze współrzędnymi (25, 25) i (50, 50)");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\n\nTworzymy Box ze współrzędnymi (10, 10) i (20, 20)");
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();

        System.out.println("\n\nTworzymy Box z punktem (7, 9), szerokością 50 i wysokością 20");
        rect.buildBox(new Point(7, 9), 50, 20);
        rect.printBox();
    }
}
