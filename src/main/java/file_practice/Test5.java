package file_practice;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice");
        long l = getlen(file);
        System.out.println(l);
    }

    public static long getlen(File file) {
        long len = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                len = len + f.length();
            } else {
                len = len + getlen(f);
            }
        }
        return len;
    }
}
