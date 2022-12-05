package collection.generics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("asdsa");
        System.out.println(list.get(0));
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(3);
        list2.add(4);
        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>();
        ListUtil.addAll(list3, 1, 2);
        ListUtil.addAll2(list3, 1, 2, 4, 5);
        System.out.println(list3);
    }
}
