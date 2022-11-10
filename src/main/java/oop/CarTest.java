package oop;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("enter brand");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("enter price");
            int price = sc.nextInt();
            c.setPrice(price);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car);
        }
    }
}
