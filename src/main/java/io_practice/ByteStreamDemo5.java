package io_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("src/main/java/io_practice/a.txt");
        FileOutputStream fos = new FileOutputStream("src/main/java/io_practice/copy.txt");

        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(bytes, 0, len);
        }


        fis.close();
        fos.close();
    }
}
