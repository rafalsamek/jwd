package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class GloryBe implements Prayer {
    @Override
    public String getPrayer() {
        return "GLORY BE to the Father, and to the Son,\n" +
                "and to the Holy Spirit. As it was in the\n" +
                "beginning is now, and ever shall be, world\n" +
                "without end. Amen." +
                Prayer.getDelimiter();
    }
}
