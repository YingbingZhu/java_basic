package test;

import java.util.TreeMap;

public class TreeMapCounter {
    public static void main(String[] args) {
        /*
            if sort use treemap
         */
        String s = "afbdsmfbdhsf";

        TreeMap<Character, Integer> tm= new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);

            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }

        System.out.println(tm);
        StringBuilder sb = new StringBuilder();

        tm.forEach((key, cnt) -> {
            sb.append(key).append("(").append(cnt).append(") ");
        });
        System.out.println(sb);

    }

}
