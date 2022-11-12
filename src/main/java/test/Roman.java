package test;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        /*
        input a string consist of only digits, make it to roman number
        */
        String str;
        while (true) {
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            boolean flag =check(str);
            if (flag){
                break;
            } else{
                System.out.println("re-enter");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c =  str.charAt(i);
            int number = c - '0';
            System.out.println(number);
            String s = toRoman(number);
            System.out.println(s);
            sb.append(s);
        }
        System.out.println(sb.toString());



    }

    public static String toRoman(int number) {
        String[] arr = {"", "Ⅰ","Ⅱ","Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ", "Ⅹ"};
        return arr[number];
    }

    public static boolean check(String str) {
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ( c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
