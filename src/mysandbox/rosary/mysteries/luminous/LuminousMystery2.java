package mysandbox.rosary.mysteries.luminous;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class LuminousMystery2 extends AbstractMystery {
    public String getAnnouncement() {
        return "The second Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Wedding at Cana, when Christ manifested";
    }
}
