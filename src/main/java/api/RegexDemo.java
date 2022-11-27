package api;

public class RegexDemo {
    public static void main(String[] args) {
        String qq = "12345a67580";
        // start with 1-9, all digits, total 6-20
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        // \s blank; \S not blank; \w = [a-zA-Z_0-9]
        // \\ = \
        System.out.println("a".matches("\\w")); // true
        System.out.println("3".matches("\\d"));// true
        System.out.println("!".matches("\\W"));// true

        // one or no: X?
        // more or no: X*
        // onr or more:X+
        // X{n}


        System.out.println("a".matches("[abc]")); // true
        System.out.println("az".matches("[abc]")); // false
        System.out.println("zz".matches("[^abc][^abc]")); // true

        System.out.println("zz".matches("[^abc][^abc]")); // true
        System.out.println("z".matches("[a-z&&[^abc]]")); // true

        System.out.println("\"");

        System.out.println("ABC".matches("(?i)abc")); // true
        System.out.println("ABC".matches("a(?i)bc")); // false
        System.out.println("aBC".matches("a(?i)bc")); // true
    }
}
