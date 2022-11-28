package api;

public class IntegerDemo {
    public static void main(String[] args) {
        // auto-boxing and unboxing
        Integer i1 = 10;

        Integer i2 = new Integer(10);
        int i = i2;

        String str1 = Integer.toBinaryString(100);
        System.out.println(str1); // 1100100

        String str2 = Integer.toOctalString(100);
        System.out.println(str2); // 144

        String str3 = Integer.toHexString(100);
        System.out.println(str3); // 64

        int i3 = Integer.parseInt("123");
        System.out.println(i3);
        System.out.println(i3 + 1);

        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}
