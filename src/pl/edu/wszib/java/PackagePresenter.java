package pl.edu.wszib.java;

public class PackagePresenter {

    public PackagePresenter() {
        System.out.println("Raz dwa trzy...");
    }

    public void showPackage() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie " + this.getClass().getPackageName());
    }

    public static void main(String[] args) {
        PackagePresenter pp = new PackagePresenter();
        pp.showPackage();
    }
}
