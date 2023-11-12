package mysandbox.rosary.parts;

import mysandbox.rosary.mysteries.Mystery;

public abstract class AbstractPart implements Part {
    public String getPrayer() {
        String prayer = "";

        for (Mystery mystery : this.getMysteries()) {
            prayer += mystery.getPrayer() + '\n';
        }

        return prayer;
    }

    public abstract String getName();

    public abstract Mystery[] getMysteries();
}
