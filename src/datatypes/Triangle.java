package datatypes;

public class Triangle {
    char sign = '©';
    String space = " ";

    public void drawTriangle() {
        System.out.println(space + space + space + sign + space + space + space);
        System.out.println(space + space + sign  + space +  sign + space + space);
        System.out.println(space + sign + space + space + space + sign + space);
        System.out.println(sign + space + sign + space + sign + space + sign);
    }
}
