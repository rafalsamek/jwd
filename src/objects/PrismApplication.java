package objects;

public class PrismApplication {
    public static void main(String[] args) {
        Prism prism = new Prism();
        prism.width = 20;
        prism.height = 30;
        prism.depth = 40;

        prism.print();
    }
}
