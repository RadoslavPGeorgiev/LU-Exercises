/**
 * Created by student on 11/6/2019.
 */
public class Lawyer extends Employee {
    public Lawyer(int years) {
        super(years);
    }
   public String getVacationForm() {
       return "pink";
   }

    public int getVacationDays() {
        return super.getVacationDays() + 5;
   }
   public void sue() {
       System.out.println("I'll see you in court!");
   }
    public double getSalary() {
        return super.getSalary() + 5000 * getYears();
    }
}

