package basic;

public class WhileDemo {


    public int reverseNumber(int x) {
        int num = 0;
        while ( x != 0 ) {
            int digit = x % 10;
            x /= 10;
            num = num * 10 + digit;
        }
        return num;
    }

    public void getDivMod(int dividend, int divisor) {
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }

    }


    public static void main(String[] args) {

    }

}
