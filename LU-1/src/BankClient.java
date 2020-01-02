import java.util.Scanner;
import java.util.Set;

public class BankClient {
    private int current = -1;
    private Scanner scanner = new Scanner(System.in);
    private boolean done = false;

    private Bank bank = new Bank();

    private  void newAccount(){
        boolean isforeign = requestForeign();
        current = bank.newAccount(isforeign);
        System.out.println("Your new account number is " + current);
    }

    private  void select(){
        System.out.print("Enter acct# ");

        current = scanner.nextInt();
        int balance = bank.getBalance(current);
        System.out.printf("The balance of account "+ current +" is "+balance);
    }

    private  void deposit(){
        System.out.print("Enter deposit amt: ");
        int amt = scanner.nextInt();

        bank.deposit(current, amt);
    }

    private void authorizeLoan(){
        System.out.print("Enter loan amt: ");
        int loanamt = scanner.nextInt();

        if (bank.authorizeLoan(current, loanamt))
            System.out.println("Your loan is approved");
        else
            System.out.println("Your loan is denied");
    }

    private void showAll() {
        System.out.println(bank.toString());
    }

    public void run(){
        while(!done){
            System.out.print("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest, 7=set foreign): ");
            int cmd = scanner.nextInt();

            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) {
        if (cmd==0) quit();
        else if(cmd == 1) newAccount();
        else if(cmd == 2) select();
        else if(cmd == 3) deposit();
        else if(cmd == 4) authorizeLoan();
        else if(cmd == 5) showAll();
        else if(cmd == 6) addInterest();
        else if(cmd == 7) setForeign();
        else
            System.out.println("Illegal command!");
    }
    public void quit() {
        System.out.println("Goodbye!");
    }

    private boolean requestForeign() {
        System.out.print("Enter 1 for foeign, 2 for domestic: ");
        int val = scanner.nextInt();
        return val == 1;
    }

    private void setForeign(){
        bank.setForeign(current, requestForeign());
    }

    private  void addInterest()
    {
        bank.addInterest(current);
    }
}
