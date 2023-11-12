package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class HailMary implements Prayer {
    @Override
    public String getPrayer() {
        return "HAIL MARY, full of grace, the Lord is\n" +
                "with thee. Blessed art thou among women,\n" +
                "and blessed is the fruit of thy womb, Jesus.\n" +
                "Holy Mary, Mother of God, pray for us\n" +
                "sinners, now and at the hour of our death.\n" +
                "Amen." +
                Prayer.getDelimiter();
    }
}
