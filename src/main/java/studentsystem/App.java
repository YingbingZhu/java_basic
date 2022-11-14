package studentsystem;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("welcome");
            System.out.println("select: 1 login  2 register  3 forget");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forget(list);
                    break;
                case "4":
                    System.out.println("exit");
                    System.exit(0);
                default:
                    System.out.println("no option");
            }
        }
    }

    private static void forget(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("not registered");
            return;
        }
        System.out.println("please enter personalId");
        String personalId = sc.next();
        System.out.println("please enter phone number");
        String phoneNumber = sc.next();

        int index = findIndex(list, username);
        User u = list.get(index);
        if (!(u.getPersonalId().equalsIgnoreCase(personalId) && u.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("wrong");
            return;
        }

        String password;
        while (true) {
            System.out.println("new password");
            password = sc.next();
            System.out.println("password again");
            String password2 = sc.next();
            if (password2.equals(password)) {
                System.out.println("same");
                break;
            } else {
                System.out.println("wrong");
            }
        }

        u.setPassword(password);
        System.out.println("password update");


    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        User u = new User();
        String username;
        String password;
        String personalId;
        String phoneNumber;
        while (true) {
            System.out.println("please enter username");
            username = sc.next();
            // format then distinct
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("wrong format");
                continue;
            }
            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("username " +  username + " exist");
            } else {
                System.out.println("s");
                break;
            }
        }
        while (true) {
            System.out.println("enter password");
            password = sc.next();
            System.out.println("password again");
            String password2 = sc.next();
            if (!password.equals(password2)) {
                System.out.println("wrong");
                continue;
            } else {
                System.out.println("success");
                break;
            }
        }
        while (true) {
            System.out.println("please enter person_id");
            personalId = sc.next();
            boolean flag3 = checkPersonalId(personalId);
            if (flag3) {
                System.out.println("s");
                break;
            } else {
                System.out.println("wrong personal id");
            }
        }
        while (true) {
            System.out.println("please enter phone number");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if (flag4) {
                System.out.println("correct number");
                break;
            } else {
                System.out.println("wrong phone number");
            }
        }
        System.out.println("register success");
        u.setPassword(password);
        u.setPersonalId(personalId);
        u.setPhoneNumber(phoneNumber);
        u.setUsername(username);
        list.add(u);
        

    }


    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
             if (!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')) {
                 return false;
             }
        }
        return true;
    }

    private static boolean checkPersonalId(String personalId) {
        if (personalId.length() != 18) {
            return false;
        }
        if (personalId.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < personalId.length() - 1; i++) {
            char c = personalId.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        char endChar = personalId.charAt(personalId.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (User user : list) {
            if (username.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUsername(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        for (char c:username.toCharArray()) {
            if (!(( c >= 'a' && c <= 'z' )||(c >= '0' && c <= '9')||(c >= 'A' && c <= 'Z'))) {
                return false;
            }
        }
        int count = 0;
        for (char c:username.toCharArray()) {
            if ((( c >= 'a' && c <= 'z' )||(c >= 'A' && c <= 'Z'))) {
               count++;
               break;
            }
        }
        return count > 0;
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter username");
            String username = sc.next();
            if (!contains(list, username)) {
                System.out.println("username not exist");
                return;
            }
            System.out.println("please enter password");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("please enter code");
                System.out.println("correct code is " + rightCode);
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("correct code");
                    break;
                } else {
                    System.out.println("wrong code");
                }
            }

            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("login success");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("wrong ");
                if (i == 2) {
                    System.out.println(username + " locked");
                    return;
                } else {
                    System.out.println(i + " times left");
                }
            }

        }

    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(userInfo.getUsername()) && u.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }


    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[randomIndex];
        arr[randomIndex] = temp;

        return new String(arr);

    }


}
