package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num < 1 || num > 100) {
                System.out.println("wrong number");
                continue;
            }
            list.add(num);  // auto-boxing,, int >> Integer  Integer.valueOf(num)
            int sum = getSum(list);

            if (sum > 200) {
                System.out.println("finish");
                break;
            }

        }

    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
