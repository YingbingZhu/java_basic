package io_practice;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/main/java/io_practice/a.txt");

        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        fr.close();
    }
}
