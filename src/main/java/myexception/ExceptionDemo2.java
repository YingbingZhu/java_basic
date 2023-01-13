package myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
            public String getMessage()  return throwable string
            public String toString()
            public void printStackTrace()  print to console  (getMessage() and toString() )
         */

        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
