package objects;

public class Sampler {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.height = 72;
        sample.widht = 1000;
        sample.depth = 420;

        System.out.println("Wysokość: " + sample.height);
        System.out.println("Szerokość: " + sample.widht);
        System.out.println("Głębokość: " + sample.depth);
    }
}
