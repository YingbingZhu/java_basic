package oop;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "mi";
        p.price = 1999.98;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
    }
}
