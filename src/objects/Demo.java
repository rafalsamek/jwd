package objects;

import java.awt.*;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Object object = new Object();
        String name = new String("Ala");
        Point point = new Point(0, 0);

        System.out.println(Math.max(23423, 23));

        String s1, s2;
        s1 = String.valueOf(550);
        s2 = s1.valueOf(550); //zapis mylący, bo to metoda narzędziowa, statyczna

        System.out.println(s1);
        System.out.println(s2);

        int accountBalance = 15005;

        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);
        System.out.printf(new Locale("us"), "Saldo: %,d zł%n", accountBalance);

        // s - strings
        // d - decimal integers
        // f - floating points
        // t - date/time
        // n - new line
        // bB - boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n", pi);
        System.out.printf("%.20f%n", pi);

        byte a = 7;
        short b;
        int c;

        c = a; //konwersja niejawna
        b = (short) c; //konwersja jawna - rzutowanie

        int aa = 5;
        double bb = 13.5;

        double cc = bb/aa; //konwersja niejawna
        double ccc = bb/(double) aa; //konwersja jawna - rzutowanie

        int cccc = (int) bb / aa; // rzutowanie

        //boxing, unboxing
        Float f1 = 12.5F;
        Float f2 = 27.2F;

        System.out.println("Mniejsza z liczb: " + Math.min(f1, f2));
    }
}
