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


    }
}
