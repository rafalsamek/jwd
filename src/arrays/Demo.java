package arrays;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        // deklaracje
        String[] requests;
        Point[] points;
        float[] donations;

        String targets[];

        // definicje
        int[] temps = new int[99];
        temps[22] = 77;

        System.out.println(temps[22]);
        System.out.println(temps[23]);

        Integer[] series = new Integer[3];
        series[0] = 10;
        series[1] = 3;
        series[2] = 5;

        System.out.println(series[0] + " " + series[1] + " " + series[2]);
//        System.out.println(series[3]); // Exception

        Integer[] series1 = {10, 3, 5};
        System.out.println(series1[2]);

        char[] letters = {'a', 'b', 'c'};
        System.out.println(letters[0]);

        Point[] points2 = {new Point(1, 1), new Point(0, 0), new Point(7, 4)};
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point point = new Point(1, 1);
        Point[] ppoints = new Point[3];

        ppoints[0] = point;
        ppoints[1] = ppoints[0]; // new Point(1, 1);
        ppoints[2] = ppoints[1]; // new Point(1, 1);

        ppoints[1].x = 50;

        System.out.println(ppoints[0]); // 50, 1
        System.out.println(ppoints[1]); // 50, 1
        System.out.println(ppoints[2]); // 50, 1
    }
}
