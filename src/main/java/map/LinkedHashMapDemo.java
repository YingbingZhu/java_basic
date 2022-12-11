package map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        /*
            ordered,no index, ensure seq
            doubly linked list
         */
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("a", 123);
        lhm.put("a", 111);
        lhm.put("b", 1234);
        lhm.put("c", 1234);

        System.out.println(lhm);

    }
}
