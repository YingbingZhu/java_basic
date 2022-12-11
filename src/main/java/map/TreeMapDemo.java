package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "a");
        tm.put(4, "bb");
        tm.put(3, "ab");
        tm.put(2, "abc");

        // sort by key value
        System.out.println(tm); // 1, 2, 3, 4

        // make it order reserve
        TreeMap<Integer, String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm2.put(1, "a");
        tm2.put(4, "bb");
        tm2.put(3, "ab");
        tm2.put(2, "abc");

        // sort by key value
        System.out.println(tm2); // 4 3 2 1
    }
}
