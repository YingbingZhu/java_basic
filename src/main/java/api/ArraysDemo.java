package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 10)); // -4  =  -(3 + 1)
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 0));  // -1

        int[] newArr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr1));

        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr2));

        Arrays.fill(newArr1, 10);
        System.out.println(Arrays.toString(newArr1));

        Arrays.sort(newArr1);

        Arrays.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
