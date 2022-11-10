package oop;


/**
 * Javabean : NOT INCLUDE MAIN 
 */
public class Phone {
    String brand;
    double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call() {
        System.out.println("call");
    }
    public void playGame() {
        System.out.println("gaming..");
    }
}
