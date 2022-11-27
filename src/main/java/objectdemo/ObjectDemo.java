package objectdemo;


import com.google.gson.Gson;

import java.util.Objects;

public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 0};
        User u1 = new User(1, "yb", "123", "girl11", data);

        // overwrite clone()
        // javabean implements cloneable
        // deep copy: String reuse, string pool;    CREATE NEW PRIMITIVE DATA TYPES

        User u2 = (User) u1.clone();
        u1.getData()[1] = 1;
        System.out.println(u1);
        System.out.println(u2);

        Gson gson = new Gson();
        String s = gson.toJson(u1);
        System.out.println(s);

        User user = gson.fromJson(s, User.class);
        System.out.println(user);

        boolean res = Objects.equals(u1, u2);
        System.out.println(res);

        boolean aNull = Objects.isNull(u2);
        System.out.println(aNull);

        boolean b = Objects.nonNull(u1);
        System.out.println(b);

    }

}
