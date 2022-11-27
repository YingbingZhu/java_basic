package api;

public class RegexDemo1 {
    public static void main(String[] args) {
        String s1 = "13806789764";
        System.out.println(checkPhone(s1));
        System.out.println(checkPhone2("0592-3456782"));
        System.out.println(checkEmail("www@qq.com"));
    }

    public static boolean checkPhone(String s) {
        return s.matches("1[3-9]\\d{9}");
    }

    public static boolean checkPhone2(String s) {
        return s.matches("0\\d{2,3}-?[1-9]\\d{4,9}");
    }

    public static boolean checkEmail(String s) {
        // (\.[a-zA-Z]{2,3}){1,2} : .com   .com.cn
        return s.matches("\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}");
    }

    public static boolean checkUsername(String s) {
        return s.matches("\\w{4,16}");
    }

    public static boolean checkId(String s) {
        return s.matches("[1-9]\\d{5}(18|19|20)\\d{2}(\\d|X|x)");
    }

    public static boolean checkTime(String s) {
        return s.matches("([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
    }

}
