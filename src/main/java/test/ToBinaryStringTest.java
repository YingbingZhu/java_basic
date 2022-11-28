package test;

public class ToBinaryStringTest {
    public static void main(String[] args) {
        int number = 6;
        String s = toBinaryString(number);
        System.out.println(s);
        System.out.println(Integer.toBinaryString(number));
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while(true){
            if (number == 0){
                break;
            }
            int remainder = number % 2;
            sb.insert(0, remainder);
            number /= 2;
        }
        return sb.toString();
    }
}
