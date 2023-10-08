package datatypes;

public class Demo {
    public static void main(String[] args) {

        // liczby całkowite
        // byte -1  00000000
        // short -2 00000000 00000000
        // int - 4 00000000 00000000 00000000 00000000 (domyślny)
        // long - 8 0000000 00000000 00000000 00000000 0000000 00000000 00000000 00000000

        System.out.println(2324324324234234234L);

        byte b = -120;
        short s = 3126;
        int i = 1_123_456_789;

        long ll = 123234234234234L;
        long l = i * b;


        // liczby zmiennoprzecinkowe
        // float - 4
        // double - 8 (domyślny)

        double a = 34.45;
        float f = 1.4F;
        double d = 342343234.234234234;

        // typ znakowy
        System.out.println('a'); // znak
        System.out.println("a"); // napis
        System.out.println('\''); // apostrof
        System.out.println('\t'); // tabulator
        System.out.println(">" + '\t' +"<"); // konkatenacja

        char c = 64;
        System.out.println(c);
        System.out.println((int) c);

        // boolean
        boolean chosen = true;
        boolean q = false;

        System.out.println(chosen);
        System.out.println(q);

        // String
        String name = "Ala";
        System.out.println(name);

        System.out.println("Czesć, jestem " + name);

        System.out.println("tekst" + 1 + 2);
        System.out.println("tekst" + (1 + 2));
        System.out.println(1 + 2 + "tekst");
    }
}
