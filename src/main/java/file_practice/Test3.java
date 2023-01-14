package file_practice;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        // enter the dir
        findAVI();

    }

    public static void findAVI() {
        File[] arr = File.listRoots();
        for (File file : arr) {
            findAVI(file);
        }
    }

    public static void findAVI(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    // recursion
                    findAVI(file);
                }
            }
        }
    }
}
