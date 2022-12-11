package collection;

import java.util.TreeSet;

public class TreeSetTestDemo {
    public static void main(String[] args) {
        Student2 s1 = new Student2("YB", 1, 2, 3, 4);
        Student2 s2 = new Student2("YBB", 1, 4, 5, 4);
        Student2 s3 = new Student2("YBB", 1, 4, 5, 4);

        TreeSet<Student2> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);

    }
}
