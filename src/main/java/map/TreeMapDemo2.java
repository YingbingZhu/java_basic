package map;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        Student s1 = new Student("yb", 22);
        Student s2 = new Student("ybb", 23);
        Student s3 = new Student("ybba", 23);
        tm.put(s1, "js");
        tm.put(s2, "tj");
        tm.put(s3, "xm");
        System.out.println(tm);

    }
}
