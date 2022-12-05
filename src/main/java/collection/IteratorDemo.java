package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("aaab");
        coll.add("aaabbbb");

        // like a pointer, point at 0
        Iterator<String> iterator = coll.iterator();

        while (iterator.hasNext()) {
            // get element and move next
            String s = iterator.next();
            if ("aaab".equals(s)){
                iterator.remove();
            }
            System.out.println(s);
        }
        System.out.println(coll);
        // System.out.println(iterator.next()); //NoSuchElementException





    }
}
