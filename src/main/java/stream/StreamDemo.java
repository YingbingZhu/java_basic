package stream;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("zhang");
        list1.add("zhu");
        list1.add("chen");

        list1.stream().filter(name->name.startsWith("zh")).filter(name->name.length() == 3).forEach(name -> System.out.println(name));
    }
}
