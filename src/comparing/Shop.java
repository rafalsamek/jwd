package comparing;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko", 3.90);
        Product product2 = new Product("Mleko", 3.90);

        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));
    }
}
