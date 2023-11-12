package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class InTheName implements Prayer {
    @Override
    public String getPrayer() {
        return "IN THE NAME of the Father, and of the\n" +
                "Son, and of the Holy Spirit. Amen" +
                Prayer.getDelimiter();
    }
}
