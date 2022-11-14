package studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        getCode();
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

        System.out.println(new String(arr));
        return new String(arr);

    }
}
