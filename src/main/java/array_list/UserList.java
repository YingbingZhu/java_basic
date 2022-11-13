package array_list;

import java.util.ArrayList;

public class UserList {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("1", "yb", "123");
        User u2 = new User("2", "yb1", "123");
        User u3 = new User("3", "yb2", "123");

        list.add(u1);
        list.add(u2);
        list.add(u3);
    }

    public static boolean contains(ArrayList<User> list, String id) {
        return getIndex(list, id)>=0;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
