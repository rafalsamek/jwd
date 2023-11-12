package mysandbox.rosary.mysteries;

import mysandbox.rosary.Prayer;

public interface Mystery extends Prayer {
    String getName();

    String getAnnouncement();
}
