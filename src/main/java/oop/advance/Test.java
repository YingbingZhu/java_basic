package oop.advance;

public class Test {
    public static void main(String[] args) {
         /*
         primitive type: final can not alter and override
         reference type: address can not alter, content can change
          */
        final double PI = 3.14;

        final Student s = new Student();
        // s = new Student();  can not alter address
        s.setAge(13);

        final int[] ARR = {1, 2, 3, 4, 5};
        ARR[1] = 10;


    }
}

class Father {
    public final void show() {
        System.out.println("father show");
    }
}

class Son extends Father {

}
