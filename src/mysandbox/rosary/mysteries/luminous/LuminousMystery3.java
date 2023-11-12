package mysandbox.rosary.mysteries.luminous;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class LuminousMystery3 extends AbstractMystery {
    public String getAnnouncement() {
        return "The third Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Proclamation of the Kingdom of God";
    }
}
