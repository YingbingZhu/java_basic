package inheritance;

public class Cook extends Employee{
    public Cook(int id, String name, double salary) {
        super(id, name, salary);
    }

    public Cook() {

    }

    @Override
    public void work() {
        System.out.println("cook work");
    }
}
