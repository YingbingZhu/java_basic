package array_list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        byte - Byte;
        short - Short
        char - Character
        int - Integer
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");

        list.remove("aaa");
        list.remove(1);

        String result = list.set(1, "ddd");
        System.out.println(result);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        System.out.println(list1);
    }
}
