package mysandbox.wardrobe;

import mysandbox.wardrobe.materials.Cherry;

public class WardrobeApplication {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(180, 100, 80, new Cherry());
        wardrobe.getDetails();
    }
}
