package api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String s = "JAVA8adsjfbdjsfbdsj, JAVA11, JKFDSHFU";
        // Regex object
        Pattern p = Pattern.compile("(?i)Java\\d{0,2}");
        // Matcher object
        Matcher m = p.matcher(s);
        // if found, record index
//        boolean b = m.find();
//        // substring
//        String s1 = m.group();
//        System.out.println(s1);
//
//        // find next one
//        b = m.find();
//        String s2 = m.group();
//        System.out.println(s2);

        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
