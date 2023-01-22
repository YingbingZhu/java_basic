package io_practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/java/io_practice/a.txt");
        fos.write(97);
        fos.write(98);
        byte[] bytes = {97, 98, 99, 100};

//        fos.write(bytes);
        fos.write(bytes, 1, 2); // 98, 99   b, c

        fos.close();
    }
}
