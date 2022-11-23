package api;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);

        // Runtime.getRuntime().exit(0); // = System.exit()

        System.out.println(Runtime.getRuntime().availableProcessors());

        // byte
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
