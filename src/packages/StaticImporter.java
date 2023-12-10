package packages;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StaticImporter {
    public static void main(String[] args) {
        System.out.println(java.lang.Math.sqrt(25));
        System.out.println(Math.sqrt(25));
        System.out.println(sqrt(25));

        System.out.println(PI);
    }
}
