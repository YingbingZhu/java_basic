package polymorphism;


public class Test2 {
    public static void main(String[] args) {
        Animal a = new Dog();

        // variables
        // compile & run: left
        System.out.println(a.name);   // animal

        // method
        // compile: left; run: right
        a.show();

        if (a instanceof Dog) {
            Dog d  = (Dog) a;
        } else {
            System.out.println("can not cast");
        }

    }
}

class Animal {
    String name = "animal";

    public void show() {
        System.out.println("animal");
    }
}

class Dog extends Animal {
    String name = "dog";

    @Override
    public void show() {
        System.out.println("dog");
    }
}
