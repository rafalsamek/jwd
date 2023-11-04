package objects;

public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ale to się rozrasta.";

        str2 = str1; // zmienna str2 wskazuje na to samo co zmienna str1

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("Ten sam obiekt? " + (str1 == str2));

        str2 = new String(str1);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("Ta sama wartość? " + (str1.equals(str2)));

        String sstr1 = "Jakiś napis.";
        System.out.println(sstr1.getClass().getName());
        System.out.println(sstr1.getClass().getSimpleName());

        boolean check1 = "Teksas" instanceof String;
        System.out.println(check1);

        Object object = new Object();
        boolean check2 = object instanceof String;
        System.out.println(check2);

        boolean check3 = "Ala ma kota" instanceof Object;
        System.out.println(check3);
    }
}
