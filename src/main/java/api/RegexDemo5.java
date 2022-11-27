package api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        // greedy   + / *
        // non-greedy +?/ *?
        String s = "abbbbbbbaaaaaaa";
        // Regex object
        // Pattern p = Pattern.compile("ab+?"); //ab
        Pattern p = Pattern.compile("ab+"); // abbbbbbb
        // Matcher object
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
