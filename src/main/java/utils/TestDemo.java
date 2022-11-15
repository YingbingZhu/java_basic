package utils;

import oop.advance.Student;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        String s = ArrayUtils.printArr(arr1);
        System.out.println(s);
        double average = ArrayUtils.getAverage(arr1);
        System.out.println(average);

        ArrayList<Student> stu = new ArrayList<>();
        Student s1 = new Student("yb", 24, "f");
        Student s2 = new Student("ybb", 22, "f");
        Student s3 = new Student("ybbb", 25, "f");
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        int maxAge = StudentUtils.getMaxAge(stu);
        System.out.println(maxAge);
    }
}
