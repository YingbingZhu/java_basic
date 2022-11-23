package inheritance;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, school);
    }
}


