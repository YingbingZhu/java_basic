package lambda;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 1};

        // functional programming
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
    }
}
