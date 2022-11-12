package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        sb.append("abc");
        System.out.println(sb.capacity());  // 16

        // add
        sb.append(1);
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);

        // length
        System.out.println(sb.length());

        // to string
        sb.append("aaa");
        sb.append("bbb");
        String str = sb.toString();
        System.out.println(str);

        int len = sb.substring(1).replace("b", "c").length();
        System.out.println(len);
    }
}
