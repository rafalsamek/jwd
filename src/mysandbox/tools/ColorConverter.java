package mysandbox.tools;

public class ColorConverter {
    public static void main(String[] args) {
        String color  = "#ce6d28";
        System.out.println("Before conversion: " + color);

        int[] rgb = ColorConverter.colorHexToRgb(color);
        System.out.println("After conversion hex to rgb: ");
        System.out.println("red: " + rgb[0]);
        System.out.println("green: " + rgb[1]);
        System.out.println("blue: " + rgb[2]);

        String hex = ColorConverter.colorRgbToHex(
            rgb[0],
            rgb[1],
            rgb[2]
        );

        System.out.println("After conversion rgb to hex: ");
        System.out.println(hex);
    }

    public static int[] colorHexToRgb(String color) {
        int[] rgb = new int[3];
        rgb[0] = HexConverter.hexToDecimal(color.substring(1, 3));
        rgb[1] = HexConverter.hexToDecimal2(color.substring(3, 5));
        rgb[2] = HexConverter.hexToDecimal(color.substring(5, 7));

        return rgb;
    }

    public static String colorRgbToHex(int red, int green, int blue) {
        String hex = "#";
        hex += HexConverter.decimalToHex(red);
        hex += HexConverter.decimalToHex(green);
        hex += HexConverter.decimalToHex(blue);

        return hex;
    }
}
