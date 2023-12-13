package modifiers;

public class InstanceCounter {
    private static int numInstances;

    public static int getCount() {
        return numInstances;
    }

    public InstanceCounter() {
        numInstances++;
    }

    public static void main(String[] args) {
        System.out.print("Zaczynamy z ");
        System.out.println(InstanceCounter.getCount() + " obiektów.");

        for (int i = 0; i < 100; i++) {
            new InstanceCounter();
        }

        System.out.print("Kończymy z ");
        System.out.println(InstanceCounter.getCount() + " obiektów.");
    }
}
