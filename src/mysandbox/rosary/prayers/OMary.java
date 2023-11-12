package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class OMary implements Prayer {
    @Override
    public String getPrayer() {
        return "O MARY, conceived without sin, pray for us\n" +
                "who have recourse to Thee, and for those who\n" +
                "do not have recourse to Thee, especially the\n" +
                "enemies of the Church and the recommended to Thee." +
                Prayer.getDelimiter();
    }
}
