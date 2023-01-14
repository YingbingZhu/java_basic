package file_practice;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         createNewFile()
         mkdir()
         mkdirs()
         delete()
         */
        File f1 = new File("/Users/yingbingzhu/Documents/GitHub/" +
                "java_basic/src/main/java/file_practice/test.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);

        File f2 = new File("/Users/yingbingzhu/Documents/GitHub/" +
                "java_basic/src/main/java/file_practice/test/");
        f2.mkdirs();
        f2.delete();

        f2.mkdirs();

        File f3 = new File("/Users/yingbingzhu/Documents/GitHub/" +
                "java_basic/src/main/java/file_practice");
        File[] listFiles = f3.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }

        File[] listRoots = File.listRoots();
        System.out.println(Arrays.toString(listRoots));

        File f4 = new File("/Users/yingbingzhu/Documents/GitHub/");
        String[] list = f4.list();
        System.out.println(Arrays.toString(list));

        String[] list1 = f4.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return (src.isFile() && name.endsWith(".txt"));
            }
        });


    }
}
