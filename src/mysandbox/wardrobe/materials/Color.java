package mysandbox.wardrobe.materials;

import mysandbox.tools.ColorConverter;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(String hex) {
        this.setColor(hex);
    }

    public Color(int red, int green, int blue) {
        this.setColor(red, green, blue);
    }

    /**
     *
     * @param hex e.g. #FF17DD
     */
    public void setColor(String hex) {
        int[] rgb = ColorConverter.colorHexToRgb(hex);
        this.red    = rgb[0];
        this.green  = rgb[1];
        this.blue   = rgb[2];
    }

    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getColor() {
        return ColorConverter.colorRgbToHex(this.red, this.green, this.blue);
    }

    public String toString() {
        return this.getColor();
    }
}
