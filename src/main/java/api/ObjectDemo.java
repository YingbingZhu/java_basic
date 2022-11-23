package api;

import inheritance.Student;

public class ObjectDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1); // java.lang.Object@29453f44


        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));    // false
    }
}
