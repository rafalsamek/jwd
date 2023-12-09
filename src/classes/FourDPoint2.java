package classes;

import java.awt.*;

public class FourDPoint2 extends Point {
    int z;
    int t;

    public static void main(String[] args) {
        FourDPoint2 fourDPoint = FourDPoint2.create(1, 2, 3, 4);
        fourDPoint.show();
    }

    static FourDPoint2 create(int x, int y, int z, int t) {
        FourDPoint2 fourDPoint2 = new FourDPoint2();
        fourDPoint2.x = x;
        fourDPoint2.y = y;
        fourDPoint2.z = z;
        fourDPoint2.t = t;

        return fourDPoint2;
    }

    void show() {
        System.out.println("x wynosi " + this.x);
        System.out.println("y wynosi " + this.y);
        System.out.println("z wynosi " + this.z);
        System.out.println("t wynosi " + this.t);
    }
}
