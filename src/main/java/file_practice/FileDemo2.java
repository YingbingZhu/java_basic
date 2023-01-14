package file_practice;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 =  new File("/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice/");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        String parent = "/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice/";
        String child = "FileDemo1.java";
        File f2 = new File(parent, child);

        // kb: len / 1024
        System.out.println(f2.length()); // bytes, only for file
        System.out.println(f2.getAbsolutePath());

        long time = f2.lastModified();
        System.out.println(time);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(time));





    }
}
