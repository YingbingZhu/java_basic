package test;

public class Decrypt {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
