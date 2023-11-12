package mysandbox.rosary.mysteries.luminous;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class LuminousMystery4 extends AbstractMystery {
    public String getAnnouncement() {
        return "The forth Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Transfiguration of Our Lord";
    }
}
