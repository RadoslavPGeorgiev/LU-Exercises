public class BankAccount {
    private  int acctnum;
    private  int balance = 0;
    private boolean isforeign = false;

    public BankAccount(int accountNumber){
        acctnum = accountNumber;
    }

    public int getAcctnum() {
        return acctnum;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isIsforeign(){
        return  isforeign;
    }
    public  void setForeign(boolean b){
        isforeign = b;
    }
}
