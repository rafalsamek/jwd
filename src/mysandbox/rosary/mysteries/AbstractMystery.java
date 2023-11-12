package mysandbox.rosary.mysteries;

import mysandbox.rosary.Prayer;

public abstract class AbstractMystery implements Mystery {
    public abstract String getName();

    public abstract String getAnnouncement();

    public String getPrayer() {
        return  Prayer.getDelimiter() +
                this.getAnnouncement() +
                new Decade().getPrayer();
    }
}
