package constructors;

import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint namedPoint = new NamedPoint(5, 3, "SmallPoint");
        System.out.println("x=" + namedPoint.x);
        System.out.println("y=" + namedPoint.y);
        System.out.println("nazwa=" + namedPoint.name);
    }
}
