package io_practice;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/io_practice/a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char)b);
        }
        fis.close();
    }
}
