/**
 * Created by student on 11/6/2019.
 */
public class Employee {

    private int years;
    public Employee(int years) {
        this.years = years;
    }

    public int getHours() {
        return 40;
    }

    public int getYears() {
        return years;
    }

    public int getSeniorityBonus() {
        return 2 * years;
    }

        public double getSalary() {
        return 50000.0;
    }
        public int getVacationDays() {
            return 10 + getSeniorityBonus();
    }
    public String getVacationForm() {
        return "yellow";
    }
    }
