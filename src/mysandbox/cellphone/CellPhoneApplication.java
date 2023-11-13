package mysandbox.cellphone;

import mysandbox.cellphone.brands.Brands;
import mysandbox.cellphone.colors.SamsungS23Colors;
import mysandbox.cellphone.models.SamsungModels;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone(Brands.SAMSUNG, SamsungModels.S23, SamsungS23Colors.BLACK);
        cellPhone.getDetails();
    }
}
