package string;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String rightUsername = "yb";
        String rightPassword = "123456";


        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter username");
            String username = sc.next();
            System.out.println("please enter password");
            String pwd = sc.next();

            // compare
            if (username.equals(rightUsername) && pwd.equals(rightPassword)) {
                System.out.println("login success");
                break;
            } else {
                if (i == 2) {
                    System.out.println("locked");
                } else {
                    System.out.println("wrong username or password, left " + (2-i) + " times" );
                }
            }
        }


    }

}
