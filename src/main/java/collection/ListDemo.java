package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(1, "ddd");
        String s = list.remove(3);
        list.set(1, "ddd");
        System.out.println(list.get(0));
        System.out.println(s);
        System.out.println(list);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.remove(2); // remove index 2
        arr2.remove(Integer.valueOf(2)); // remove value 2
        System.out.println(arr2);

    }
}
