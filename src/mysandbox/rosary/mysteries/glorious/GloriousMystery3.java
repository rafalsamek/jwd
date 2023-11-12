package mysandbox.rosary.mysteries.glorious;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class GloriousMystery3 extends AbstractMystery {
    public String getAnnouncement() {
        return "The third Glorious Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Descent of the Holy Spirit at Pentecost";
    }
}
