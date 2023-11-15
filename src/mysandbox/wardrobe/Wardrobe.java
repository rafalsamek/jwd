package mysandbox.wardrobe;

import mysandbox.wardrobe.materials.Material;

public class Wardrobe {
    int hight;
    int width;
    int depth;
    Material material;

    public Wardrobe(int hight, int width, int depth, Material material) {
        this.hight = hight;
        this.width = width;
        this.depth = depth;
        this.material = material;
    }

    public void getDetails() {
        System.out.println("Materiał z którego zrobiona jest szafa to: " + this.material.getName());
        System.out.println("Kolor szafy to: " + this.material.getColor());
        System.out.println("Wysokość szafy wynosi: " + this.hight + " cm");
        System.out.println("Szerokość szafy wynosi: " + this.width + " cm");
        System.out.println("Głębokość szafy wynosi: " + this.depth + " cm");
    }
}
