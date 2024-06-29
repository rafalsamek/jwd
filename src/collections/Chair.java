package collections;

import java.util.Objects;

public class Chair {
    private String model;
    private String manufacturer;
    private int productionYear;

    public Chair(String model, String manufacturer, int productionYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return productionYear == chair.productionYear && Objects.equals(model, chair.model) && Objects.equals(manufacturer, chair.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, productionYear);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
