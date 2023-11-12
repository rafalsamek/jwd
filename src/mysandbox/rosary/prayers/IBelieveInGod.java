package mysandbox.rosary.prayers;

import mysandbox.rosary.Prayer;

public class IBelieveInGod implements Prayer {
    @Override
    public String getPrayer() {
        return "I BELIEVE IN GOD, the Father almighty,\n" +
                "Creator of Heaven and earth. And in Jesus\n" +
                "Christ, His only Son, our Lord, Who was\n" +
                "conceived by the Holy Spirit, born of the\n" +
                "Virgin Mary, suffered under Pontius Pilate;\n" +
                "was crucified, died, and was buried. He\n" +
                "descended into Hell. The third day He rose\n" +
                "again from the dead. He ascended into\n" +
                "Heaven, and sits at the right hand of God,\n" +
                "the Father almighty. He shall come again to\n" +
                "judge the living and the dead. I believe in\n" +
                "the Holy Spirit, the holy Catholic Church,\n" +
                "the communion of saints, the forgiveness of\n" +
                "sins, the resurrection of the body, and life\n" +
                "everlasting. Amen." +
                Prayer.getDelimiter();
    }
}
