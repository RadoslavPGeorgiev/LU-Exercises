/**
 * Created by student on 11/6/2019.
 */
public class Marketer extends Employee {

    public Marketer(int years) {
        super(years);
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0;
    }
}

