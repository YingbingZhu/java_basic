package test;

public class Multiply {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "12345";

        int number1 = toNumber(num1);
        int number2 = toNumber(num2);

        String res = Integer.toString(number1 * number2);
        System.out.println(res);
        
        
    }

    public static int toNumber(String str) {
        int num = 0;
        int i = 1;
        for (char c: str.toCharArray()){
            int digit = c - '0';
            num += digit * Math.pow(10,(str.length()-i));
            i += 1;
        }
        return num;
    }
}
