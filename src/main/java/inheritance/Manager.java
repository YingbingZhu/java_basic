package inheritance;

import java.sql.SQLOutput;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("work supervise");
    }
}
