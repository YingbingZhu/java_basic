package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhu-m-15", "zhang-f-16", "zhu1-m-15");
        // collect all male data
        List<String> newList = list.stream()
                .filter(s -> "m".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(newList);

        Set<String> set = list.stream()
                .filter(s -> "m".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(set);

        /*
            toMap( key function, value function)
            Function( stream data type, key data type)

            apply( stream data type)


         */
        Map<String, Integer> map = list.stream()
                .filter(s -> "m".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        Map<String, Integer> map1 = list.stream()
                .filter(s -> "m".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],s -> Integer.parseInt(s.split("-")[2])
                    ));

        System.out.println(map);
        System.out.println(map1);

    }
}
