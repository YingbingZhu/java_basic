package oop.abstract_interface;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("ybbb", 12);
        System.out.println(f.getAge() + ", " + f.getName());

        f.eat();
        f.swim();

    }
}
