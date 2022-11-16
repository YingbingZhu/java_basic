package polymorphism;

public class Administrator extends Person{

    @Override
    public void show() {
        System.out.println("admin info:" + getName() + ", " + getAge());
    }
}
