package inheritance;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        // use other constructor from class, JVM will not initiate super()
        this(null, 0, "xxx");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
