package homeworks.homework3.point2;

import java.util.Random;

public abstract class ToyotaFactory {
    protected Car[] parking;

    private final static String[] MODELS = {
        "Yaris",
        "Corolla",
        "Aygo",
    };

    public final static String[] COLORS = {
        "srebrny",
        "niebieski",
        "czarny",
    };

    private final static int[] YEARS = {
        2018,
        2019,
        2020
    };

    public Car produceCar() {
        Random random = new Random();

        return new Car(
                MODELS[random.nextInt(MODELS.length)],
                COLORS[random.nextInt(COLORS.length)],
                YEARS[random.nextInt(YEARS.length)]
        );
    }

    public void fillParking() {
        for (int i = 0; i < this.parking.length; i++) {
            this.parking[i] = this.produceCar();
        }
    }

    public Car[] getParking() {
        return parking;
    }


}
