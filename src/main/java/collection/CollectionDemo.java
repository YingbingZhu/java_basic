package collection;

import oop.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // collection is a interface,
        Collection<String> coll = new ArrayList<>();

        boolean b = coll.add("aaa"); // list > true; set > if exist false
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        // coll.clear();
        coll.remove("aaa");
        System.out.println(coll);
        boolean bbb = coll.contains("bbb");
        System.out.println(bbb);

        Collection<Student> coll1 = new ArrayList<>();

        Student s1 = new Student(1, "yb", 11);
        Student s2 = new Student(2, "yb", 11);
        Student s3 = new Student(1, "yb", 11);

        coll1.add(s1);
        coll1.add(s2);
        System.out.println(coll.contains(s3)); // false;  contains use Object.equals( address)

        boolean empty = coll1.isEmpty();
        System.out.println(empty);
        int size = coll.size();
        System.out.println(size);


    }
}
