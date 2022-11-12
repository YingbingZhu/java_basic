package string;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = new StringBuilder(str).reverse().toString();

        if (s.equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
