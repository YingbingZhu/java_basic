package io_practice;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // encode
        String str = "love";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // USE GBK to encode
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // decode
        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(bytes1, "GBK");
        System.out.println(str3);

    }
}
