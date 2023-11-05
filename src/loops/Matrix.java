package loops;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę od 1 do 30: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //naciśnij F12 i wpisz liczbę n
        if (n < 1 || n > 30) {
            System.out.println("Podano nieprawidłową liczbę.");
            return;
        }
        for (int j = 0; j < n ; j++) {
            for (int i = 1; i <= n ; i++) {
                System.out.print(i + j);
                if (i < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
}
