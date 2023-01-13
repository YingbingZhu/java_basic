package myexception;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len < 3 || len > 10) {
//            throw new RuntimeException();
            throw new NameFormatException(" length error");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException{
        if (age < 18 || age > 40) {
//            throw new RuntimeException();
            throw new AgeOutOfBoundsException(" length error");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
