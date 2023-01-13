package myexception;

public class ThrowDemo {
    public static void main(String[] args) {
        /*
            public void () throws exceptions
         */
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        System.out.println(max);

    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
