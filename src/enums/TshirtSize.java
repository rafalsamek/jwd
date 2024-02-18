package enums;

public enum TshirtSize {
    S(23, 23, 23),
    M(45, 45, 45),
    L(60, 60, 60),
    XL(80, 80, 80);

    private int chestWidth;

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    private int shirtLength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

}
