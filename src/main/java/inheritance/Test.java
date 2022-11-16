package inheritance;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.catchMouse();

        Husky h = new Husky();
        h.eat();
        h.breakHome();

        // can not use constructor from superclass
        // Son s = new Son("hi");
        Son s = new Son();
        String name = s.name;
        // s.privateName;  private access
        s.show();

        Student s1 = new Student();

    }
}

class Father {
    String name = "father";
    private String privateName;

    private int a = 0x111;
    int b = 0x222;

    public Father(){}
    public Father(String name) {
        this.name = name;
    }

    public void drink() {
        System.out.println("father drink");
    }


}

class Son extends Father {
    int c = 0x333;
    String name = "son";
    public void show() {
        String name = "son1";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    public void drink() {
        System.out.println("son drink");
    }
}
