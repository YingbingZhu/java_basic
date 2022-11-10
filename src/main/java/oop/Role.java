package oop;

import java.util.Arrays;
import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyFaces = {"handsome", "ugly", "strange"};
    String[] girlFaces = {"pretty", "ugly", "strange"};

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == 'F') {
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else if (gender == 'M') {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        }  else {
            this.face = "unknown";
        }

    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // attack
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remain = role.getBlood() - hurt;
        remain = remain < 0 ? 0 : remain;
        role.setBlood(remain);
        System.out.println(this.getName() + " attack " + role.getName() + ", and " + role.getName() + " lose " + hurt +
                ", remain " + remain);
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                ", gender=" + gender +
                ", face='" + face + '\'' +
                ", boyFaces=" + Arrays.toString(boyFaces) +
                ", girlFaces=" + Arrays.toString(girlFaces) +
                '}';
    }
}
