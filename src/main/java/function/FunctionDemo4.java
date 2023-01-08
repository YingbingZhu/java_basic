package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}
