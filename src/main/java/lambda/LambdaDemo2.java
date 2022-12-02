package lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {


        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("swimming..");
            }
        });

        method(
                ()->{
                    System.out.println("swimming");
                }

        );
    }

    public static void method(Swim s) {
        s.swimming();
    }
}


@FunctionalInterface
interface Swim{
    public abstract void swimming();
}
