package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class EternalRest implements Prayer {
    @Override
    public String getPrayer() {
        return "ETERNAL REST grant unto them, O Lord,\n" +
                "and let perpetual light shine upon them.\n" +
                "Through the mercy of God, may they rest\n" +
                "in peace. Amen." +
                Prayer.getDelimiter();
    }
}
