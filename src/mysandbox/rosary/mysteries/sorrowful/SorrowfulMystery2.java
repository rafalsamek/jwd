package mysandbox.rosary.mysteries.sorrowful;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class SorrowfulMystery2 extends AbstractMystery {
    public String getAnnouncement() {
        return "The second Sorrowful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "Our Lord is Scourged at the Pillar";
    }
}
