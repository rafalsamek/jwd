package objects;

public class Sampler {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.height = 72;
        sample.width = 1000;
        sample.depth = 420;

        System.out.println("Wysokość: " + sample.height);
        System.out.println("Szerokość: " + sample.width);
        System.out.println("Głębokość: " + sample.depth);
    }
}
