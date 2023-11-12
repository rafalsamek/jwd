package mysandbox.rosary.mysteries.glorious;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class GloriousMystery4 extends AbstractMystery {
    public String getAnnouncement() {
        return "The forth Glorious Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Assumption of Mary into Heaven";
    }
}
