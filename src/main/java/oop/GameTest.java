package oop;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("yb", 100, 'F');
        Role r2 = new Role("ybb", 100, 'M');

        System.out.println(r1);
        r2.toString();

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + " kills " + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + " kills " + r1.getName());
                break;
            }
        }

    }
}
