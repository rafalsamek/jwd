package homeworks.homework3.point2;

/**
 * Na parkingach Toyoty w trzech fabrykach nazwanych Motomachi, Tsutsumi, Tahara
 * znajdują się parkingi z wyprodukowanymi samochodami.
 * Modele samochów produkowanych ww fabrykach to Yaris, Corolla i Aygo
 * w kolorach srebrnym, niebieskim i czarnym, produkowanych
 * w latach 2018, 2019 i 2020.
 * Pojemność parkingów w poszczególnych fabrykach to
 * Motomachi - 5000, Tsutsumi - 4500, Tahara - 1700.
 * Napisz program analizujący dane znajdujących się tam pojazdów wg wytycznych:
 * samochód jako typ Car powinien przechowywać takie informacje jak nazwa modelu, kolor oraz rocznik,
 * parkingi w odpowiednich fabrykach powinny być reprezentowane jako tablice typu Car,
 * zapełnij prakingi samochodami w losowych konfiguracjach,
 * wyświetl informacje ile srebrnych Toyot Yaris z rocznika 2020 znajduje się na parkingu fabryki Motomachi,
 * wyświetl informacje jakiego koloru samochodów jest najwięcej na parkingu fabryki Tsutsumi,
 * wyświetl informacje o pierwszych 10 samochodach na parkingu fabryki Tahara.
 */
public class ToyotaFactoriesTester {
    public static void main(String[] args) {
        Motomachi motomachi = new Motomachi();
        motomachi.fillParking();

        Tsutsumi tsutsumi = new Tsutsumi();
        tsutsumi.fillParking();

        Tahara tahara = new Tahara();
        tahara.fillParking();

        Car carToBeCounted = new Car("Yaris", "srebrny", 2020);
        System.out.println("Jest " + countCars(carToBeCounted, motomachi) +
            " samochodów o następujących parametrach: " + carToBeCounted);

        System.out.println("Najczęstszym kolorem w fabryce Tsutsumi jest " + findMostFrequentColor(tsutsumi));

        for (int i = 0; i < 10; i++) {
            System.out.println(tahara.getParking()[i]);
        }
    }

    private static int countCars(Car carToBeCounted, ToyotaFactory toyotaFactory) {
        int counter = 0;
        for (Car car : toyotaFactory.getParking()) {
            if (car.equals(carToBeCounted)) {
                counter++;
            }
        }

        return counter;
    }

    private static int countColors(String color, ToyotaFactory toyotaFactory) {
        int counter = 0;
        for (Car car : toyotaFactory.getParking()) {
            if (car.getColor() == color) {
                counter++;
            }
        }

        return counter;
    }

    private static String findMostFrequentColor(ToyotaFactory toyotaFactory) {
        int mostFrequentColorCounter = 0;
        int colorCounter;
        String mostFrequentColor = null;
        for (String color : ToyotaFactory.COLORS) {
            colorCounter = countColors(color, toyotaFactory);
            if (colorCounter > mostFrequentColorCounter) {
                mostFrequentColorCounter = colorCounter;
                mostFrequentColor = color;
            }
        }

        return mostFrequentColor;
    }
}
