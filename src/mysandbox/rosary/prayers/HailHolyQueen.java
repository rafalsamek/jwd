package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class HailHolyQueen implements Prayer {
    @Override
    public String getPrayer() {
        return "HAIL HOLY QUEEN, mother of mercy;\n" +
                "our life, our sweetness, and our hope. To\n" +
                "thee do we cry, poor banished children of\n" +
                "Eve. To thee do we send up our sighs,\n" +
                "mourning and weeping in this vale of tears.\n" +
                "Turn, then, most gracious advocate, thine\n" +
                "eyes of mercy toward us. And after this, our\n" +
                "exile, show unto us the blessed fruit of thy\n" +
                "womb, Jesus. O clement, O loving, O sweet\n" +
                "Virgin Mary. Pray for us, O holy Mother of\n" +
                "God, that we may be made worthy of the\n" +
                "promises of Christ. Amen." +
                Prayer.getDelimiter();
    }
}
