package collection;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int math;
    private int eng;
    private int chn;

    public Student2() {
    }

    public Student2(String name, int age, int math, int eng, int chn) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.eng = eng;
        this.chn = chn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getChn() {
        return chn;
    }

    public void setChn(int chn) {
        this.chn = chn;
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1 = this.getChn() + this.getEng() + this.getMath();
        int sum2 = o.getChn() + o.getEng() + o.getMath();
        int i = sum1 - sum2;

        i = i == 0 ? this.getChn() - o.getChn() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEng() - o.getEng() : i;

        i = i == 0 ? this.getAge() - o.getAge() : i;

        return i;
    }
}
