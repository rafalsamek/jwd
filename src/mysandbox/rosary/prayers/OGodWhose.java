package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class OGodWhose implements Prayer {
    @Override
    public String getPrayer() {
        return "O GOD, WHOSE only-begotten Son by\n" +
                "His life, death and resurrection, has\n" +
                "purchased for us the rewards of eternal life;\n" +
                "grant, we beseech Thee, that by meditating\n" +
                "upon these mysteries of the Most Holy\n" +
                "Rosary of the Blessed Virgin Mary, we may\n" +
                "imitate what they contain and obtain what\n" +
                "they promise, through the same Christ our\n" +
                "Lord. Amen" +
                Prayer.getDelimiter();
    }
}
