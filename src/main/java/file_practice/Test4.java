package file_practice;

import java.io.File;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice/aaa");
        System.out.println(Arrays.toString(file.listFiles()));
        delete(file);
    }

    /*

     */
    public static void delete(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            // if isFile delete
            if (f.isFile()) {
                f.delete();
            } else {
                delete(f);
            }
        }
        file.delete();
    }
}
