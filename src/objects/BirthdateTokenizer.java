package objects;

import java.util.StringTokenizer;

public class BirthdateTokenizer {
    public static void main(String[] args) {
        String birthdate = "29/04/2016";

        StringTokenizer stringTokenizer = new StringTokenizer(birthdate, "/");

        System.out.println(stringTokenizer.nextToken());
        System.out.println(stringTokenizer.nextToken());
        System.out.println(stringTokenizer.nextToken());
    }
}
