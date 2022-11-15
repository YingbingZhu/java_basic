package oop.advance;

public class StudentTest {
    // JVM use, String[] args nouse
    public static void main(String[] args) {

        Student.teacherName = " hi";

        
        Student s1 = new Student();
        s1.setName("yb");
        s1.setAge(24);
        s1.setGender("f");

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("ybb");
        s2.setAge(25);
        s2.setGender("m");

        s2.study();
        s2.show();
    }
}
