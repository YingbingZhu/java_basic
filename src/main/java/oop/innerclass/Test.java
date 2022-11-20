package oop.innerclass;

public class Test {
    public static void main(String[] args) {
        Ca.Engine ce = new Ca().new Engine();




        /*
            new class or new interface
         */

        new Swim() {

            @Override
            public void swim() {
                System.out.println(" overwrite swim");

            }
        };
        
        new Animal() {

            @Override
            public void eat() {

            }
        };

        method(
                new Animal() {
                    @Override
                    public void eat() {

                    }
                }
        );

        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println(" overwrite swim");
            }
        };

    }

    public static void method(Animal a) {
        a.eat();
    }


}
