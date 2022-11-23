package api;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println(Math.ceil(-88.24));

        System.out.println(Math.floor(23.45));
        System.out.println(Math.max(23, 45));
        System.out.println(Math.min(23, 45));

        System.out.println(Math.pow(2, 3));  // 8
        System.out.println(Math.pow(4, 0.5));  // 2
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
