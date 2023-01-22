package io_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/main/java/io_practice/a.txt");
        String str = "abc";
        byte[] arr = str.getBytes();
        System.out.println(Arrays.toString(arr));
        fos.write(arr);

        // windows  \r\n
        // linux \n
        // mac  \r
        fos.write("\r".getBytes());

        String str1 = "abc";
        byte[] arr1 = str.getBytes();
        System.out.println(Arrays.toString(arr));
        fos.write(arr);

        fos.close();

    }

}
