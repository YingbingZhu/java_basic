package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhu", "zhang", "shan");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // if true keep
                return s.startsWith("zhu");
            }
        }).forEach(s -> System.out.println(s));

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("zhu"));
        Stream<String> s2 = s1.filter(s -> s.length() == 3);
        s2.forEach(s -> System.out.println(s));

        Stream<String> s3 = s1.filter(s -> s.length() == 3);

        // limit  skip
        list.stream().limit(3).skip(4).forEach(s-> System.out.println(s));

        // concat
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "zhu", "zhang", "zhao", "zhu");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "zhu", "zhang", "zhao");

        list1.stream().distinct().forEach(s -> System.out.println(s));
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));

        // map
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "s-13", "z-14");

        // String: original type; Object: converted type
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                return Integer.parseInt(arr[1]);
            }
        }).forEach(s -> System.out.println(s));

        list.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
