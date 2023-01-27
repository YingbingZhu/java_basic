package io_practice;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/main/java/io_practice/a.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        fr.close();


    }
}
