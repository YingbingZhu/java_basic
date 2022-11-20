package oop.abstract_test;

public class Test {
    public static void main(String[] args) {
        PingPongPlayer pps = new PingPongPlayer("yb", 12);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.speak();
        pps.study();

        Inter.show1();
        
    }
}
