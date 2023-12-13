package lab13.package1;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();

        lab13.package2.PackageTester pt2 = new lab13.package2.PackageTester();
        pt2.introduce();

        lab13.package3.PackageTester pt3 = new lab13.package3.PackageTester();
        pt3.introduce();
    }
}
