package datatypes;

public class Triangle {
    char sign;

    public void drawTriangle() {
        System.out.println("   " + sign + "   ");
        System.out.println("  " + sign  + " " +  sign + "  ");
        System.out.println(" " + sign + "   " + sign + " ");
        System.out.println(sign + " " + sign + " " + sign + " " + sign);
    }
}
