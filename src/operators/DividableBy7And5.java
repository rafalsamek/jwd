package operators;

public class DividableBy7And5 {

    public static void main(String[] args) {
        int number = 435;
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("Liczba " + number + " jest podzielna przez 5 i 7.");
        } else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 5 i 7.");
        }
    }
}
