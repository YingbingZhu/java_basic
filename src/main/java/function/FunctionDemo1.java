package function;


import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        // anonymous classes
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        // lambda
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        // method reference
        /* functional interface? same params?
        *
        *
         */
        Arrays.sort(arr, FunctionDemo1::substraction); // static method  Integer::parseInt




    }
    
    public static int substraction(int num1, int num2) {
        return num2 - num1;
    }
}
