package api;

public class RegexDemo6 {
    public static void main(String[] args) {
        String s = "yb429857fsybbfsdjfks";
        String res = s.replaceAll("[\\w&&[^_yb]]+", "vs");
        System.out.println(res);
        String s1 = "yb429857fsybbfsdjfks";
        String[] res1 = s1.split("[\\w&&[^_yb]]+");
        for (int i = 0; i < res1.length; i++) {
            System.out.println(res1[i]);
        }
    }
}
