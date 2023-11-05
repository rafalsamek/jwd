package loops;

import java.util.Scanner;

public class BinToDecimal {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę binarną: ");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine(); //naciśnij F12 i wpisz liczbę binarną

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != '0' && in.charAt(i) != '1') {
                System.out.println("Podana liczba nie jest liczbą binarną!");
                return;
            }
        }

        long sum = 0;
        String binary = in;

        for (int i = binary.length()-1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                sum += Math.pow(2, binary.length() - 1 - i);
            }
        }

        System.out.println(sum);
    }
}
