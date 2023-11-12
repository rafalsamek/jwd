package mysandbox.rosary.mysteries.sorrowful;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class SorrowfulMystery4 extends AbstractMystery {
    public String getAnnouncement() {
        return "The forth Sorrowful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "Our Lord Carries the Cross to Calvary";
    }
}
