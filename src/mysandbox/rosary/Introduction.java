package mysandbox.rosary;

import mysandbox.rosary.prayers.*;

public class Introduction implements Prayer {
    private final Prayer[] elements = {
        new InTheName(),

        new IBelieveInGod(),

        new OurFather(),

        new HailMary(),
        new HailMary(),
        new HailMary(),

        new GloryBe(),

        new OMyJesus(),
        new OMary()
    };

    public String getPrayer() {
        String prayer = "";

        for (Prayer element : this.elements) {
            prayer += element.getPrayer();
        }

        return prayer;
    }
}
