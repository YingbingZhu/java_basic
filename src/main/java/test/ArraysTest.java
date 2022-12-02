package test;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abd";
        int i = s1.compareTo(s2);
        System.out.println(i);

        GirlFriend g1 = new GirlFriend("yb", 18, 13);
        GirlFriend g2 = new GirlFriend("yb", 19, 13);
        GirlFriend g3 = new GirlFriend("yb", 20, 14);

        GirlFriend[] arr = {g1, g2, g3};

        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                int temp = o1.getHeight() - o2.getHeight();
                temp = temp == 0 ? o1.getAge() - o2.getAge() : temp;

                return temp;
            }
        });
    }
}


