package api;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
/*        BigInteger bigInteger = new BigInteger("100");
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("100", 2);
        System.out.println(bigInteger1);

        // object re-use; static ( only for long)
        BigInteger bigInteger2 = BigInteger.valueOf(16);*/
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(bd1.equals(bd2));

        System.out.println(bd1.pow(2));



    }
}
