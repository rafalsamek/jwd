package mysandbox.cellphone.models;

public enum NokiaModels implements Model {
    _3310("3310"),
    _C132("C132"),
    _6310_TA("6310 TA"),
    _105("105");

    public final String label;

    NokiaModels(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
