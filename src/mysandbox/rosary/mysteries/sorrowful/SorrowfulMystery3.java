package mysandbox.rosary.mysteries.sorrowful;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class SorrowfulMystery3 extends AbstractMystery {
    public String getAnnouncement() {
        return "The third Sorrowful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "Our Lord is Crowned with Thorns";
    }
}
