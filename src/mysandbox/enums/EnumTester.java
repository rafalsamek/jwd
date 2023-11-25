package mysandbox.enums;

public class EnumTester {
    public static void main(String[] args) {
        FreshwaterFish fish1 = FreshwaterFish.grass_carp;
        SaltwaterFish fish2 = SaltwaterFish.mackerel;
        Fish fish3 = SaltwaterFish.herring;
//        fish3 = FreshwaterFish.carp;

        System.out.println(fish1);
        System.out.println(fish2);
        System.out.println(fish3);
    }
}
