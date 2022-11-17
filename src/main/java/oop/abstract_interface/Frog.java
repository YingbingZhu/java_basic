package oop.abstract_interface;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating xxx");
    }

    @Override
    public void swim() {

    }
}
