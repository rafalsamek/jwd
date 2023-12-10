package modifiers;

public class WashingMachine {
    private int temperature;
    private int spinning;

    void modeForSensitiveClothes() {
        temperature = 30;
        spinning = 800;
    }

    void modeForTowelsAndBedLinen() {
        temperature = 90;
        spinning = 1200;
    }
}
