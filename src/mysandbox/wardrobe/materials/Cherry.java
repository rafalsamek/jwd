package mysandbox.wardrobe.materials;

public class Cherry implements Material {
    private final String name = "Cherry";
    private Color color = new Color("#65000C");
    @Override
    public String getName() {
        return "Cherry";
    }

    @Override
    public String getColor() {
        return this.color.getColor();
    }
}
