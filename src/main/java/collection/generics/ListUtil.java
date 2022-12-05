package collection.generics;

import java.util.ArrayList;

public class ListUtil {

    private ListUtil(){}

    public static<E> void addAll(ArrayList<E> list, E e1, E e2) {
        list.add(e1);
        list.add(e2);
    }

    public static<E> void addAll2(ArrayList<E> list, E ...e) {
        for (E e1 : e) {
            list.add(e1);
        }
    }

}
