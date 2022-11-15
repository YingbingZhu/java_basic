package oop.advance;

public class Student {
    private String name;
    private int age;
    private String gender;
    // all object use name teacherName
    public static String teacherName;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + " study");
    }

    public void show() {
        System.out.println(this);
        System.out.println(this.name + ", " + this.age + ", " + this.gender + ", " + this.teacherName);

        this.study();
        method();
    }

    public static void method() {
        // System.out.println(this);   static method cannot use this
    }
}
