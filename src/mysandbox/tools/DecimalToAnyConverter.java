package mysandbox.tools;

import java.util.Scanner;

/**
 * Implement a class that converts a decimal number to a number in any (2-36) number system and tests it
 */
public class DecimalToAnyConverter {
    public static void main(String[] args) {
        System.out.println("This program converts converts a decimal number to a number in any (2-36) number system.");
        String yN;
        do {
            System.out.print("Decimal number: ");
            Scanner input1 = new Scanner(System.in);
            int decimal = input1.nextInt();

            System.out.print("Number system: ");
            Scanner input2 = new Scanner(System.in);
            int numberSystem = input2.nextInt();

            if (numberSystem > 36 || numberSystem < 2) {
                System.out.println("Number system range is from 2 to 36.");
                System.out.println();
                yN = "y";
                continue;
            }

            String any;
            try {
                any = DecimalToAnyConverter.convert(decimal, numberSystem);
            } catch (Throwable throwable) {
                System.out.println(throwable.getMessage());
                System.out.println();
                yN = "y";
                continue;
            }
            System.out.println("The number in " + numberSystem + " number system: " + any);

            System.out.print("Do you want to calculate again? y/N ");
            Scanner input3 = new Scanner(System.in);
            yN = input3.nextLine().toLowerCase();
            System.out.println();
        } while (yN.equals("y"));
        System.out.println("Goodbye!");
    }

    public static String convert(int decimal, int numberSystem) {
        String any = "";

        while(decimal > 0) {
            any = DecimalToAnyConverter.convertDigit(decimal % numberSystem, numberSystem) + any;
            decimal /= numberSystem;
        }

        return any;
    }

    public static char convertDigit(int digit, int numberSystem) {
        if (digit >= numberSystem) {
            throw new IllegalStateException("The digit: " + digit + " is out of range of " + numberSystem + " number system.");
        }

        return switch(digit) {
            case 0 -> '0';
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> '5';
            case 6 -> '6';
            case 7 -> '7';
            case 8 -> '8';
            case 9 -> '9';
            case 10 -> 'a';
            case 11 -> 'b';
            case 12 -> 'c';
            case 13 -> 'd';
            case 14 -> 'e';
            case 15 -> 'f';
            case 16 -> 'g';
            case 17 -> 'h';
            case 18 -> 'i';
            case 19 -> 'j';
            case 20 -> 'k';
            case 21 -> 'l';
            case 22 -> 'm';
            case 23 -> 'n';
            case 24 -> 'o';
            case 25 -> 'p';
            case 26 -> 'q';
            case 27 -> 'r';
            case 28 -> 's';
            case 29 -> 't';
            case 30 -> 'u';
            case 31 -> 'v';
            case 32 -> 'w';
            case 33 -> 'x';
            case 34 -> 'y';
            case 35 -> 'z';
            default -> throw new IllegalStateException("Unexpected value: " + digit);
        };
    }
}
