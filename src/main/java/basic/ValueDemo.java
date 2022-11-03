package basic;


public class ValueDemo {
    public static void main(String[] args) {
        System.out.println("name" + '\t' + "age");
        System.out.println("amy" + '\t' + "26");

        System.out.println(017);        // OCT 8 + 7
        System.out.println(0b11);   // BIN   1 + 2
        System.out.println(0x11);     // HEX    1 + 16
        System.out.println(0xFF);    // 16 ^ 0 * 15 + 16 ^ 1 * 15
        System.out.println(0xF);
        System.out.println(0x1F);  // 16 ^ 0 * 15 + 16 ^ 1 * 1

        System.out.println('z' - 'a');

        // double > float > long > int > short > byte
        long n = 999999999L;      // long need to end with L
        System.out.println(n);
        float f = 10.1F;
        System.out.println(f);

        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);

        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println(x);   //12
        System.out.println(y);   // 10
        System.out.println(z);    // 12

        int a = 10;
        int b = 10;
        boolean res = ++a < 5 && ++b < 5;
        System.out.println(res);       // false
        System.out.println(a);        // 11
        System.out.println(b);          // 10

        int n1 = 10;
        int n2 = 20;
        int max = n1 > n2 ? n1 : n2;
        System.out.println(max);  // 20
    }
}
