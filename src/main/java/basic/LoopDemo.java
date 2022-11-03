package basic;

public class LoopDemo {

    public int getSquareRoot(int x) {
        for (int i = 1; i <= x; i++) {
            if ( i * i == x) {
                return i;
            } else if (i * i > x) {
                return i - 1;
            }
        }
        return -1;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime2(int x) {
        for (int i = 0; i < x; i++) {
            
        }
        return true;
    }   


    public static void main(String[] args) {

    }
}
