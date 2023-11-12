package mysandbox.rosary.mysteries.glorious;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class GloriousMystery5 extends AbstractMystery {
    public String getAnnouncement() {
        return "The fifth Glorious Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Coronation of Mary as Queen of Heaven and Earth";
    }
}
