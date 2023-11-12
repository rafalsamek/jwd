package mysandbox.rosary.mysteries.luminous;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class LuminousMystery5 extends AbstractMystery {
    public String getAnnouncement() {
        return "The fifth Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Last Supper, when Our Lord gave us the Holy Eucharist";
    }
}
