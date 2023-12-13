package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;

public class PackageTester {
    public static void main(String[] args) {
        PackagePresenter pp1 = new PackagePresenter();
        pp1.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter pp2 = new pl.edu.wszib.podyplomowe.PackagePresenter();
        pp2.showPackage();
    }
}
