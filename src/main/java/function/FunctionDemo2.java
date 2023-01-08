package function;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang", "zhu", "zhao");

/*        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge)
                .forEach(s -> System.out.println(s));*/
        list.stream().filter(new FunctionDemo2()::stringJudge)
                .forEach(s -> System.out.println(s));

    }

    public boolean stringJudge(String s) {
        return s.startsWith("zhu") && s.length() == 3;
    }
}
