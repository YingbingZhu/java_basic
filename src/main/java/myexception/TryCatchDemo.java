package myexception;

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        /*
            let program proceed

            if multiple exceptions, multiple catch
         */
        try {
            System.out.println(arr[10]); // new ArrayIndexOutOfBoundsException()
            System.out.println(2/0);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
        } catch (ArithmeticException e) {
            System.out.println("can not divide by 0");
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
