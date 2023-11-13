package mysandbox.cellphone;

import mysandbox.cellphone.brands.Brand;
import mysandbox.cellphone.colors.Color;
import mysandbox.cellphone.models.Model;

public class CellPhone {
    Brand brand;
    Model model;
    Color color;

    public CellPhone(Brand brand, Model model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void getDetails() {
        System.out.println("Cell phone details:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }
}
