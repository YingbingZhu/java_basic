package oop.innerclass;

public class Ca {
    String carName;
    int carAge;
    String color;

    


    class Engine {
        String engineName;
        int age;

        public void show() {
            System.out.println(engineName);
            System.out.println(carAge);
        }
    }
}
