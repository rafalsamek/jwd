package objects;

public class FamilyMember {
    static String surname = "Nowak";
    String name;
    int age;

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Stefan";
        dad.age = 36;

        System.out.println("Nazwa rodu to: " + dad.surname); //nie używać
        System.out.println("Nazwa rodu to: " + FamilyMember.surname); //bardziej czytelne, unikniemy dwuznaczności

        System.out.println(dad.name);
//        System.out.println(FamilyMember.name); //nie zadziała
    }
}
