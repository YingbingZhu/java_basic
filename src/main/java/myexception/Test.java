package myexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                System.out.println("enter name:");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("enter age:");
                String ageStr = sc.nextLine();
                gf.setAge(Integer.parseInt(ageStr));
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            } catch (NameFormatException e) {
                e.printStackTrace();
                continue;
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                continue;
            }
        }
        System.out.println(gf);
    }
}
