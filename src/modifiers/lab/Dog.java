package modifiers.lab;

public class Dog extends Animal {
    private static final String NAME = "pies";
    private static int numberOfInstances = 0;

    public Dog() {
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
