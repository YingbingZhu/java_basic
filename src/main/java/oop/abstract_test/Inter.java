package oop.abstract_test;

public interface Inter {

    // JDK 7: abstract
    // JDK 8: default & static
    // JDK 9: private
    
    public abstract void method();

    public default void show() {
        System.out.println("default");
    }

    public static void show1() {
        System.out.println("static show1");
    }

}
