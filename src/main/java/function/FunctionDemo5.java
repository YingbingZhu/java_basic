package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang,15", "zhou,13", "zhu,14");
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));

    }
}
