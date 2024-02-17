package enums.lab;

public enum Directions {
    E("East", "Wschód"),
    NE("North East", "Północny Wschód"),
    N("North", "Północ"),
    NW("North West", "Północny Zachód"),
    W("West", "Zachód"),
    SW("South West", "Południowy Zachód"),
    S("South", "Południe"),
    SE("South East", "Południowy Wschód");

    private String englishName;
    private String polishName;

    Directions(String englishName, String polishName) {
        this.englishName = englishName;
        this.polishName = polishName;
    }

    @Override
    public String toString() {
        return "Directions{" +
                "englishName='" + englishName + '\'' +
                ", polishName='" + polishName + '\'' +
                '}';
    }
}
