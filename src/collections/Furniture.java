package collections;

public class Furniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA",2016);
        Chair chair2 = new Chair("Adde", "IKEA",2016);

        System.out.println(chair1.hashCode());
        System.out.println(chair2.hashCode());

        System.out.println(chair1.equals(chair2));
    }


}
