package io_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
            FileOutputStream
            1. create FileOutputStream object:
                path or File
            2. write
                ASCII
            3. close
         */
        FileOutputStream fos = new FileOutputStream("src/main/java/io_practice/a.txt");
        fos.write(97);
        fos.close();
    }
}
