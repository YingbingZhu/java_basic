package sort;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(getSum(100));
        System.out.println(factorial(5));
    }

    public static int getSum(int number){
        if (number==1){
            return 1;
        }
        return number + getSum(number-1);
    }

    public static int factorial(int number){
        if (number == 1){
            return 1;
        }
        return number * factorial(number-1);
    }
}
