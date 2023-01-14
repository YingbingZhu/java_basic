package file_practice;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("/Users/yingbingzhu/Documents/GitHub/java_basic/src");
        System.out.println(Arrays.toString(file.listFiles()));
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);
    }

    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                // \\ == \
                // \" = "

                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String end = arr[arr.length - 1];
                    if (hm.containsKey(end)) {
                        int count = hm.get(end);
                        count++;
                        hm.put(end, count);
                    } else {
                        hm.put(end, 1);
                    }
                }
            } else {
                // merge son map and parent map
                HashMap<String, Integer> sonMap = getCount(f);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)) {
                        hm.put(key, hm.get(key) + value);
                    } else {
                        hm.put(key, value);
                    }

                }

            }
        }
        return hm;

    }
}
