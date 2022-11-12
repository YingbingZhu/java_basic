package test;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        String str = "abcdefg";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(arr.length);
            char tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        String result = new String(arr);
        System.out.println(result);
    }
}
