package file_practice;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src/main/java/file_practice/aaa");
        f1.mkdirs();
        File src = new File(f1, "a.txt");
        boolean b = src.createNewFile();
        if(b) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }


    }
}
