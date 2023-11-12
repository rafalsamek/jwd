package mysandbox.rosary.parts;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.Mystery;

public interface Part extends Prayer {
    static Part create(Parts name) {
        return switch (name) {
            case JOYFUL -> new JoyfulPart();
            case LUMINOUS -> new LuminousPart();
            case SORROWFUL -> new SorrowfulPart();
            case GLORIOUS -> new GloriousPart();
        };
    }

    String getName();

    Mystery[] getMysteries();
}
