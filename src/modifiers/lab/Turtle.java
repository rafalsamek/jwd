package modifiers.lab;

public class Turtle extends Animal {
    private static final String NAME = "żółw";
    private static int numberOfInstances = 0;

    public Turtle() {
        numberOfInstances++;
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public int getInstanceNumber() {
        return numberOfInstances;
    }
}
