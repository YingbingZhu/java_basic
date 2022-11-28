package api;

import java.util.Scanner;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();  when encounter space, stop and return


        String line = sc.nextLine();
        System.out.println(line);
        double v = Double.parseDouble(line);
        System.out.println(v);
    }
}
