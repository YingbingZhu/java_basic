package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("aaabbb");
        coll.add("aaabbbccc");
        //
/*        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // lambda
        coll.forEach((String s) -> {
            System.out.println(s);
        });

    }
}
