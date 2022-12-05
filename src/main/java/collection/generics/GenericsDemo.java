package collection.generics;

import oop.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add("aaa");
        list.add(new Student(1,"yb", 11));

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            // can not access the specific function of sub-class
            System.out.println(o);
        }

    }
}
