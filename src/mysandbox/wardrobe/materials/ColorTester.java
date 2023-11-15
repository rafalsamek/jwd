package mysandbox.wardrobe.materials;

import mysandbox.wardrobe.materials.Color;

public class ColorTester {
    public static void main(String[] args) {
        Color color = new Color("#DDFFAA");
        System.out.println("color: " + color.getColor() );
        System.out.println(color);
    }
}
