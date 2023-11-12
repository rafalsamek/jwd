package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class WeFlyToThyPatronage implements Prayer {
    @Override
    public String getPrayer() {
        return "WE FLY TO THY PATRONAGE, O holy Mother\n" +
                "of God; despise not our petitions in\n" +
                "our necessities, but deliver us always\n" +
                "from all dangers, O glorious and blessed\n" +
                "Virgin. Amen." +
                Prayer.getDelimiter();
    }
}
