package function;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang,15", "zhu,13", "zhao,14");

        // this::   super::
        list.stream().map(Student::new).forEach(s -> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "zhang", "zhu", "zhao");

        // toUpperCase no param
        list2.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

    }
}

