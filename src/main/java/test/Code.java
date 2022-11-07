package test;

import java.util.Random;

public class Code {
    public static void main(String[] args) {
        // upper case and lower case
        char[] chr = new char[52];
        for (int i = 0; i < chr.length; i++) {
            if (i <= 25) {
                chr[i] = (char) (97 + i);
            } else {
                chr[i] = (char) (65 + i - 26);
            }
        }
        String res = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chr.length);
            res = res + chr[randomIndex];
        }
        int number = r.nextInt(10);
        res = res + number;

        System.out.println(res);

    }
}
