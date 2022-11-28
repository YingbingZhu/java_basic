package test;

public class StrToInt {
    public static void main(String[] args) {
        String str = "123456789";
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("wrong format");
        }else{
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';
                number = number * 10 + num;
            }
            System.out.println(number);
            System.out.println(number + 1);
        }
    }
}
