package collection;

import oop.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class SetDemo {
    public static void main(String[] args) {
        /*
        HashSet: drop duplicate
        LinkedHashSet: add seq
        TreeSet: sort


         */


        Set<String> s = new HashSet<>();
        boolean b = s.add("zhangsan");
        boolean b2 = s.add("zhangsan");
        System.out.println(b);
        System.out.println(b2);

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        s.forEach( str ->
                System.out.println(str)
        );

        Student s1 = new Student(1, "tb", 12);
        Student s2 = new Student(2, "tbb", 12);
        Student s3 = new Student(2, "tbb", 12);
        Student s4 = new Student(3, "tbb", 15);
        Student s5 = new Student(4, "tbbb", 15);

        // TreeSet
        // default sort: overwrite comparable
        // comparator sort
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);




    }
}
