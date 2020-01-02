import java.util.HashMap;
import java.util.Set;

public class Bank {
    private HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private double rate = 0.01;
    private int nextacct = 0;

    public int newAccount(boolean isforeign){
        int acctnum = nextacct++;
        BankAccount ba = new BankAccount(acctnum);
        ba.setForeign(isforeign);
        accounts.put(acctnum, ba);
        return acctnum;
    }

    public int getBalance(int acctnum){
        BankAccount ba = accounts.get(acctnum);
        return ba.getBalance();
    }

    public void deposit(int acctnum, int amt){
        BankAccount ba = accounts.get(acctnum);
        int balance = ba.getBalance();
        ba.setBalance( balance + amt);
    }

    public  boolean authorizeLoan(int acctnum, int loanamt){
        BankAccount ba = accounts.get(acctnum);
        int balance = ba.getBalance();
        return balance >= loanamt / 2;
    }

    public void setForeign(int acctnum, boolean isforeign){
        BankAccount ba = accounts.get(acctnum);
        ba.setForeign(isforeign);
    }
    public void addInterest(int acctnum) {
        BankAccount ba = accounts.get(acctnum);
        int balance = ba.getBalance();
        int newBalance = (int) (balance * (1 + rate));
        ba.setBalance(newBalance);
    }

    @Override
    public String toString() {
        String result = "The bank has " + accounts.size() + " accounts";
        return result;
    }
}
