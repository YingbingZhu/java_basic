package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
//        Stream<String> stream1 = list.stream();
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // Collection
        list.stream().forEach(s-> System.out.println(s));
        // Map
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aa", 1);
        hm.put("ab", 2);
        hm.keySet().stream().forEach(s-> System.out.println(s));
        // arr
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        //
        Stream.of("a", "b", "c", "d", "e").forEach(s-> System.out.println(s));
    }
}
