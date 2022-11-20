package oop.abstract_test;

public class PingPongCoach extends Coach implements English{
    @Override
    public void teach() {

    }

    @Override
    public void speak() {

    }

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }
}
