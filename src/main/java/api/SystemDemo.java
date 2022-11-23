package api;

public class SystemDemo {
    public static void main(String[] args) {
        // System.exit(0);
        long l = System.currentTimeMillis();
        System.out.println(l);

        int[] arr1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2= new int[10];

        // primitive data type should be the same
        System.arraycopy(arr1, 0, arr2, 4, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
