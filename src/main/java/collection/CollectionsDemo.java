package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "aaa", "abs");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
