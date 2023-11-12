package mysandbox.rosary.mysteries.luminous;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class LuminousMystery1 extends AbstractMystery {
    public String getAnnouncement() {
        return "The first Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Baptism of Our Lord in the River Jordan";
    }
}
