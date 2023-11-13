package mysandbox.cellphone;

import mysandbox.cellphone.brands.Brands;
import mysandbox.cellphone.colors.Nokia3310;
import mysandbox.cellphone.colors.SamsungS23Colors;
import mysandbox.cellphone.models.NokiaModels;
import mysandbox.cellphone.models.SamsungModels;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone samsung = new CellPhone(Brands.SAMSUNG, SamsungModels.S23, SamsungS23Colors.BLACK);
        samsung.getDetails();

        CellPhone nokia = new CellPhone(Brands.NOKIA, NokiaModels._3310, Nokia3310.PURPLE);
        nokia.getDetails();
    }
}
