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

        Integer[] arr3 = {3, 6, 1, 2};


        Arrays.sort(arr3, new Comparator<Integer>() {
            // binary search + insertion sort,  o1(un-order), o2(ordered)
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                // o1 - o2: asc; o2- o1: desc
                return o1 - o2;
            }
        });
    }
}
