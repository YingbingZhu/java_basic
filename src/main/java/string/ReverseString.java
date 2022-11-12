package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String reverse = reverse(next);
        System.out.println(reverse);
    }

    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            res += c;
        }
        return res;
    }
}
