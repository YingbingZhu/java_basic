package function;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhang", 13));
        list.add(new Student("zhu", 14));
        list.add(new Student("zhou", 15));

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }
}
