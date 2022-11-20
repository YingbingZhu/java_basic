package com.yb.utils;

import java.util.Random;

public class CodeUtil {
    private CodeUtil() {
    }

    public static String getCode() {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) (97 + i);
            } else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            sb.append(arr[index]);
        }
        int num = r.nextInt(9);
        sb.append(num);
        char[] chars = sb.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = r.nextInt(chars.length);
            char tmp = chars[index];
            chars[index] = chars[chars.length-1];
            chars[chars.length-1] = tmp;
        }
        return new String(chars);
    }
}
