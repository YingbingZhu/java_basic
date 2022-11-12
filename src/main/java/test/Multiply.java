package test;

public class Multiply {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "12345";

        int i = toNumber(num1);
        System.out.println(i);

    }

    public static int toNumber(String str) {
        int num = 0;
        int i = 0;
        for (char c: str.toCharArray()){
            int digit = c - '0';
            num += digit *  (str.length()-i);
            i += 1;
            System.out.println(num);
        }
        return num;
    }
}
