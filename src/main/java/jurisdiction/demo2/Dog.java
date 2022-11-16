package jurisdiction.demo2;

import jurisdiction.demo1.Animal;

public class Dog extends Animal {


    /*
    only run once, followed with class load
     */
    static {
        System.out.println("static hi");
    }

    public Dog() {
        System.out.println("hi");
    }

    public void show() {
        System.out.println(name);   // protected
    }
}
