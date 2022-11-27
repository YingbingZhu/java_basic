package api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // string is better
//        BigDecimal bd1 = new BigDecimal("0.09");
//        System.out.println(bd1);

        // static
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        System.out.println(bd1);

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
        System.out.println(bd1.divide(bd2, 3, RoundingMode.HALF_UP));

        // if not exceed double range, use valueOf



    }
}
