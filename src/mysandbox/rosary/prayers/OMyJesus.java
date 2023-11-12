package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class OMyJesus implements Prayer {
    @Override
    public String getPrayer() {
        return "O MY JESUS, forgive us our sins, save us\n" +
                "from the fires of Hell; lead all souls to\n" +
                "Heaven, especially those in most need of\n" +
                "Thy mercy. Amen." +
                Prayer.getDelimiter();
    }
}
