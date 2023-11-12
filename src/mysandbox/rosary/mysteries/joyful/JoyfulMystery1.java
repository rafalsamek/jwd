package mysandbox.rosary.mysteries.joyful;

import mysandbox.rosary.Prayer;
import mysandbox.rosary.mysteries.AbstractMystery;

public class JoyfulMystery1 extends AbstractMystery {
    public String getAnnouncement() {
        return "The first Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Annunciation of Gabriel to Mary";
    }
}
