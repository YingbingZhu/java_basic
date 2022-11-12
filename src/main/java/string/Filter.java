package string;

public class Filter {
    public static void main(String[] args) {
        String phoneNumber = "13890000843";

        String start = phoneNumber.substring(0, 3);
        System.out.println(start);

        String end = phoneNumber.substring(7);
        String res = start + "****" + end;
        System.out.println(res);
    }
}
