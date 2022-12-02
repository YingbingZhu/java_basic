package test;

public class GirlFriend {
    private String name;
    private int height;
    private int age;

    public GirlFriend(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public GirlFriend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
