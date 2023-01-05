package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NamePicker {
    public static void main(String[] args) {
        /*
         a student who has been picked would not be picked again
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F", "G", "H");
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("===========round " + i + "===========");
            Random r = new Random();
            int size = list.size();
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();
        }


    }
}
