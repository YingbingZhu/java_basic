package args;

public class ArgsDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = getSum(1,2,3,4);
        System.out.println(sum);
    }


    // array
    public static int getSum(int...args) {
        System.out.println(args);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
