public class Account {
    private double currentAmount = 0;
    public  void setAmmount(double amount) {
        synchronized (this) {
            this.currentAmount = currentAmount + amount;
        }
    }

     double getAmmount() {
        return currentAmount;
    }
}
