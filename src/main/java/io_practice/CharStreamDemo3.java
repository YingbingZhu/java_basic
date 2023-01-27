package io_practice;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/io_practice/b.txt", true);
        // fw.write(25105);
        fw.write("hi");
        fw.write("hello", 1, 3);
        char[] chars = {'a', 'b'};
        fw.write(chars);

        fw.close();
    }
}
