package function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        /*
         Student object
         concat as string and put into array
         */
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhang", 23));
        list.add(new Student("zhu", 24));
        list.add(new Student("zhong", 25));

        List<String> list1 = list.stream().map(Test2::concatString).collect(Collectors.toList());
        System.out.println(list1);
    }

    public static String concatString(Student s) {
        return s.getName() + '-' + s.getAge();

    }
}
