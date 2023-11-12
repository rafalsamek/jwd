package mysandbox.rosary.parts;

import mysandbox.rosary.mysteries.Mystery;
import mysandbox.rosary.mysteries.luminous.*;

public class LuminousPart extends AbstractPart {
    public static final String NAME = "Luminous";

    private final Mystery[] mysteries = {
        new LuminousMystery1(),
        new LuminousMystery2(),
        new LuminousMystery3(),
        new LuminousMystery4(),
        new LuminousMystery5()
    };

    public String getName() {
        return LuminousPart.NAME;
    }

    public Mystery[] getMysteries() {
        return this.mysteries;
    }
}
