package mysandbox.tools;

public class HexConverter {
    public static int hexToDecimal(String hex) throws IllegalStateException {
        int sum = 0;
        int w = hex.length();
        for (int i = 0; i < hex.length(); i++) {
            w--;
            int digit = switch(hex.charAt(i)) {
                case '0' -> 0;
                case '1' -> 1;
                case '2' -> 2;
                case '3' -> 3;
                case '4' -> 4;
                case '5' -> 5;
                case '6' -> 6;
                case '7' -> 7;
                case '8' -> 8;
                case '9' -> 9;
                case 'a', 'A' -> 10;
                case 'b', 'B' -> 11;
                case 'c', 'C' -> 12;
                case 'd', 'D' -> 13;
                case 'e', 'E' -> 14;
                case 'f', 'F' -> 15;
                default -> throw new IllegalStateException("Unexpected value: " + hex.charAt(i));
            };
            sum += digit * Math.pow(16, w);
        }
        return sum;
    }

    public static int hexToDecimal2(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String decimalToHex(int decimal, int trailingZeros) {
        return String.format("%0" + trailingZeros + "x", decimal);
    }

    public static String decimalToHex(int decimal) {
        return HexConverter.decimalToHex(decimal, 2);
    }
}
