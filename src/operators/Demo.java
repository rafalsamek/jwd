package operators;

public class Demo {
    public static void main(String[] args) {
        // arytmetyczne
        int xx = 5;
        xx = xx + 2;

        int a = 7;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a % b); // 5 % 2 = 1

        // jednoargumentowe
        int c = 5;
        int d = -c;

        System.out.println(c);
        System.out.println(d);

        int x, y, z;
        x = 42;
        y = x++;

        System.out.println(y);
        System.out.println(x);

        z = ++x;
        System.out.println(z);

        int aa = 0;
        int bb;

        bb = aa++ + aa++; // 0 + 1  = 1

        System.out.println(bb);
        System.out.println(aa);

        int aaa = 20;
        int bbb;

        bbb = aaa-- + aaa++;
        System.out.println(bbb);
        System.out.println(aaa);

        int xxx, yyy, zzz;
        xxx = yyy = zzz = 7;
        yyy = 12;

        System.out.println(yyy);

        yyy = yyy + 2;

        System.out.println(yyy);

        yyy += 2;

        System.out.println(yyy);

        int aaaa = 5;
        int bbbb = 10;

        System.out.println(aaaa > bbbb);

        boolean equal = aaaa > bbbb;

        System.out.println(equal);

        boolean equal2 = aaaa != bbbb;

        System.out.println(equal2);

        // operatory logiczne
        // negacja !
        // iloczyn logiczny &&
        // suma logiczna ||
        // równoważność ==
        // alternatywa rozłączna XOR !=

        int xxxxx = 0;
        int yyyyy = 5;

        System.out.println(xxxxx > 4 && yyyyy < 10);

        int age = 33;
        boolean test = !(age < 21);

        System.out.println(test);

        // systemy liczbowe
        // system dziesiętny 0,1,2,3,4,5,6,7,8,9
        // 154 => 1 * 10^2 + 5 * 10^1 + 4 * 10^0 = 154

        // system dwójkowa 0,1
        // 101 -> 1 * 2^1 + 0 * 2^1 + 1 * 2^0 = 4 + 0 + 1 = 5

        // system ósemkowy 0,1,2,3,4,5,6,7
        //47 -> 4 * 8^1 + 7 * 8^0 = 32 + 7 = 39

        // system szesnastkowy 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        // 3AF -> 3 * 16^2 + 10 * 16^1 + 15 * 16^0 = 3 * 256 + 160 + 15 = 768 + 160 + 15 = 943

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943));

        int aaaaaa = 11; //0000000 0000000 0000000 0001011
        System.out.println(Integer.toBinaryString(aaaaaa));

        int xxxxxx = 0b1011;
        System.out.println(xxxxxx);

        int yyyyyy = 0777;
        System.out.println(yyyyyy);

        int zzzzzz = 0xabcdef;
        System.out.println(zzzzzz);

        int aaaaaaa = 1;
        int bbbbbbb = 5;

        System.out.println(aaaaaaa & bbbbbbb); // a | b

        System.out.printf("%10s\n", Integer.toBinaryString(aaaaaaa));
        System.out.println(String.format("%32s", Integer.toBinaryString(aaaaaaa)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(bbbbbbb)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(aaaaaaa & bbbbbbb)).replace(' ', '0'));

        int ccccccc = 5;

        System.out.println(ccccccc >> 1);

        System.out.println(String.format("%32s", Integer.toBinaryString(ccccccc)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(ccccccc >> 1)).replace(' ', '0'));

        int ddddddd = 5;

        System.out.println(ddddddd << 1);

        System.out.println(String.format("%32s", Integer.toBinaryString(ddddddd)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(ddddddd << 1)).replace(' ', '0'));

        int s = 6 + 4 / 2;

        System.out.println(s);

        // arytmetyka tekstów
        String myName = "Rafal";

        myName = myName + " Junior";
//        myName += " Junior";


        System.out.println(myName);

    }
}
