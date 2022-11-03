package basic;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        //switch
        for (int i = 0, j = arr.length - 1; i < j; i ++, j --) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // new will use heap


    }
}
