package collection.generics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }

    public static<T> void method(ArrayList<T> list) {

    }

    // must be inherited from Ye
    public static<T> void method1(ArrayList<? extends Ye> list) {

    }

}
