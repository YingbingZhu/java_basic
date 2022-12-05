package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i == 2) {
                it.add(3);
            }
        }
        System.out.println(list); // 1, 2, 3, 3

    }
}
