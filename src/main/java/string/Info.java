package string;

public class Info {
    public static void main(String[] args) {
        String id = "321281202001011234";
        String year = id.substring(6, 10);
        char gender = id.charAt(16);
        // '0' -- 48;  '1' -- 49

        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }

    }
}
