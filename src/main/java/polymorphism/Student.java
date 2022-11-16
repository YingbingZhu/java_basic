package polymorphism;

public class Student extends Person{

    @Override
    public void show() {
        System.out.println("student info:" + getName() + ", " + getAge());
    }
}
