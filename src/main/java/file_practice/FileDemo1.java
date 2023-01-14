package file_practice;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice/FileDemo1.java";
        File f1 =  new File(str);
        System.out.println(f1);

        String parent = "/Users/yingbingzhu/Documents/GitHub/java_basic/src/main/java/file_practice/";
        String child = "FileDemo1.java";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File(parent + "/" + child);
        System.out.println(f3);
    }
}
