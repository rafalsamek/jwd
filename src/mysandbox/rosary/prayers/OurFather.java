package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class OurFather implements Prayer {
    @Override
    public String getPrayer() {
        return "OUR FATHER, Who art in Heaven,\n" +
                "hallowed be Thy Name. Thy kingdom\n" +
                "come, Thy will be done on earth as it is in\n" +
                "Heaven. Give us this day our daily bread,\n" +
                "and forgive us our trespasses, as we forgive\n" +
                "those who trespass against us. And lead us\n" +
                "not into temptation, but deliver us from evil.\n" +
                "Amen" +
                Prayer.getDelimiter();
    }
}
