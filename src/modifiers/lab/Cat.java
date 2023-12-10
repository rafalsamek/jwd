package modifiers.lab;

public class Cat extends Animal {
    private static final String NAME = "kot";
    private static int numberOfInstances = 0;

    public Cat() {
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
