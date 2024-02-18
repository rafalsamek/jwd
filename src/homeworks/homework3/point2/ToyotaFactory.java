package homeworks.homework3.point2;

import java.util.Random;

public abstract class ToyotaFactory {
    protected Car[] parking;

    private final static String[] models = {
        "Yaris",
        "Corolla",
        "Aygo",
    };

    public final static String[] colors = {
        "srebrny",
        "niebieski",
        "czarny",
    };

    private final static int[] years = {
        2018,
        2019,
        2020
    };

    public Car produceCar() {
        Random random = new Random();

        return new Car(
            models[random.nextInt(models.length)],
            colors[random.nextInt(colors.length)],
            years[random.nextInt(years.length)]
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
