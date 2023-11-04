package objects;

import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point(100, 100);
        p2 = p1;

        p1.x = 200;
        p1.y = 200;

        System.out.println("p1 " + p1);
        System.out.println("p2 " + p2);

        // TODO check method finalize()
    }
}
