package string;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("aaa").add("ccc");
        System.out.println(sj);
        System.out.println(sj.length());


    }
}
