package api;

public class RegexDemo7 {
    public static void main(String[] args) {
        // check if front == end
        // \\1 : use group 1
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1)); // true
        System.out.println("11231".matches(regex1)); // true
        System.out.println("----------------------------");

        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2)); // true

        // aaa123aaa
        // (.) group 1
        // \\2 use group 1
        // *: 0 or more
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3)); // true



        // remove duplicates
        String str = "aaaabbbbbccccc";

        String s = str.replaceAll("(.)\\1+", "$1"); // $1
        System.out.println(s);

        // ?:   ?=  ?!  non group
        // String regex4 = "[1-9]\\d{16}(?:\\d|X|x)\\1";
        // System.out.println("aaa".matches(regex4));
    }
}
