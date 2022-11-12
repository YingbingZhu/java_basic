package string;

public class StringDemo {
    public static void main(String[] args) {
        // check if already exist, if exist, same address
        // save memory
/*        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String("Abc");
        System.out.println(s2);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));*/

        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);


        // String pool
        String s1 = "abc";  // string pool
        String s2 = "ab";
        String s3 = s2 + "c";  // new object because of s2
        System.out.println(s1 == s3);  // false

        String s5 = "abc";  // string pool
        String s6 = "a" + "b" + "c";  // compile and reuse string pool
        System.out.println(s5 == s6);  // true



    }
}
