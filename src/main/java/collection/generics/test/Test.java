package collection.generics.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<LihuaCat> list1 = new ArrayList<>();
        ArrayList<HuskeyDog> list2 = new ArrayList<>();

    }

    public static void keepCat(ArrayList<? extends Cat> list) {

    }

    public static void keepDog(ArrayList<? extends Dog> list) {

    }
}
