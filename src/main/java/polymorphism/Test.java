package polymorphism;

public class Test {
    public static void main(String[] args) {
        Person s = new Student();
        s.setAge(10);
        s.setName("yb");
        register(s);
        Person a = new Administrator();
        a.setAge(14);
        a.setName("aa");
        register(a);
        Person t = new Teacher();
        t.setAge(13);
        t.setName("tt");
        register(t);
    }

    public static void register(Person p) {
        p.show();
    }

}
