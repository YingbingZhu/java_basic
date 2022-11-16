package polymorphism;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("teacher info:" + getName() + ", " + getAge());
    }
}
