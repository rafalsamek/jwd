package mysandbox.rosary.parts;

import mysandbox.rosary.mysteries.Mystery;
import mysandbox.rosary.mysteries.glorious.*;

public class GloriousPart extends AbstractPart {
    public static final String NAME = "Glorious";

    private final Mystery[] mysteries = {
        new GloriousMystery1(),
        new GloriousMystery2(),
        new GloriousMystery3(),
        new GloriousMystery4(),
        new GloriousMystery5()
    };

    public String getName() {
        return GloriousPart.NAME;
    }

    public Mystery[] getMysteries() {
        return this.mysteries;
    }
}
