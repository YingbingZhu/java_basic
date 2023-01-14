package file_practice;

import java.io.File;
import java.io.FilenameFilter;

public class Test2 {
    public static void main(String[] args) {

    }

    public static boolean hasFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
