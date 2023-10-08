package vars;

import oop.MarsRobot;

import java.text.DecimalFormat;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        int a; //deklaracja
        a = 2; //inicjalizacja

        int b = 7; //definicja = deklaracja + inicjalizacja

        System.out.println(a);

        String word = "abc";
        String name = "Agata";

        String mainProtocol;
        int localAreaCode = 34567;
        final int DAYS_IN_WEEK = 7;

        int c = 4; //typ podstawowy (prymitywny)

        MarsRobot marsRobot; //typ obiektowy (użytkownika) nazwa klasy lub interfejsu
        String[] streets = {"Floriańska", "Królewska", "Kijowska"}; // tablica

        //Stałe
        final double PI = 3.14;
        final int A;

        A = 7;

        //Literały
        double gpa = 3.55;
        float piValue = 3.14F;

        double x = 12e22; //12 * 10^22
        double xx = 12E22; //12 * 10^22
        double y = 19e-95; //19 * 10^-19
        double yy = 19E-95; //19 * 10^-19

        //notacja naukowa (wykłądnicza)
        double z = 3E-3; //3 * 10 ^ -3 = 0.003

        System.out.println(z);

        double p = 0.0000000000000000001d;

        System.out.println(p);
        System.out.printf("%.23f", p);
        System.out.println("\n");
        System.out.printf(new Locale("US"), "%.23f", p);
        System.out.println("\n");

        double q = 3E-10;

        DecimalFormat dc = new DecimalFormat("#.######################");

        System.out.println(dc.format(q));

        int jackpot = 3_500_000;

        System.out.println(jackpot);

        int val = 0b100100101; //binarnie

        System.out.println(val);

        int oct = 01010010107; //oktalnie

        System.out.println(oct);

        int hex = 0xFF; //heksadecymalnie

        System.out.println(hex);

        boolean chosen = true;
        char key = 'a';

        String password = "hasło";
        String message = "raz \tdwa\ttrzy";

        System.out.println(message);
    }
}
