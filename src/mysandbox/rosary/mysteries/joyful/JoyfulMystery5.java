package mysandbox.rosary.mysteries.joyful;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class JoyfulMystery5 extends AbstractMystery {
    public String getAnnouncement() {
        return "The fifth Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Finding of Our Lord in the Temple";
    }
}
