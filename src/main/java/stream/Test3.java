package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> men = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();

        Collections.addAll(men, "cai,24", "zhu,25", "wu,30");
        Collections.addAll(women, "zhang,23", "yang,25", "wu,30", "yang,24");

        Stream<String> stream1 = men.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = women.stream()
                .filter(s -> "yang".equals(s.split(",")[0]))
                .skip(1);

/*        Stream<Actor> actorStream = Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                Actor actor = new Actor(name, age);
                return actor;
            }
        });*/

        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(list);

    }
}

class Actor {
    private String name;
    private int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
