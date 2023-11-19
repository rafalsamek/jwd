package mysandbox.objects;

import java.util.Arrays;
import java.util.StringTokenizer;

public class BirthdateTokenizer {
    public static void main(String[] args) {
        String birthdate = "03/08/1982";

        StringTokenizer stringTokenizer = new StringTokenizer(birthdate, "/");

        System.out.println("Birthdate:");
        System.out.println("Day: " + stringTokenizer.nextToken());
        System.out.println("Month: " + stringTokenizer.nextToken());
        System.out.println("Year: " + stringTokenizer.nextToken());

        System.out.println("Birthdate:");
        System.out.println("Day: " + birthdate.substring(0, 2));
        System.out.println("Month: " + birthdate.substring(3, 5));
        System.out.println("Year: " + birthdate.substring(6, 10));

        String[] tokens = birthdate.split("/");

        System.out.println("Birthdate:");
        System.out.println("Day: " + tokens[0]);
        System.out.println("Month: " + tokens[1]);
        System.out.println("Year: " + tokens[2]);

        System.out.printf("Birthdate: " + String.join("-", tokens));
    }
}
