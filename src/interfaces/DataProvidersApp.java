package interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataProvidersApp {
    public static void main(String[] args) {
        DataProvider simpleDataProviderdataProvider = new SimpleDataProvider();
        DataPresenter.showData(simpleDataProviderdataProvider);

        DataProvider fileDataProvider = new FileDataProvider();
        DataPresenter.showData(fileDataProvider);
    }
}

interface DataProvider {
    String getData();
}

class SimpleDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "raz, dwa, trzy";
    }
}

class FileDataProvider implements DataProvider {
    @Override
    public String getData() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/data.txt")));
        } catch (IOException e) {
            return "Błąd: " + e.getMessage();
        }
    }
}

class DataPresenter {
    public static void showData(DataProvider dataProvider) {
        System.out.println(dataProvider.getData());
    }
}