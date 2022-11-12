package string;


import java.util.Scanner;

public class AmountConvertor {
    public static void main(String[] args) {
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter amount");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("invalid");
            }
        }
        System.out.println(money);
        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            // reverse
            moneyStr = getCapitalNumber(ge) + moneyStr;
            money = money / 10;

            if (money == 0) {
                break;
            } 
        }

        int count = 7 - moneyStr.length();

        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String res = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            res  += c + arr[i];

        }



        System.out.println(res);
    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
        
    }

}
