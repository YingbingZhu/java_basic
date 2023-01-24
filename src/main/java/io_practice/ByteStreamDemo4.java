package io_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/io_practice/a.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/io_practice/copy.txt");

        long start = System.currentTimeMillis();
        int b;
        while((b = fis.read()) != -1) {
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        fos.close();
        fis.close();
    }
}
