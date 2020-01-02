public class BankProgram {
    public static void main(String[] args){
        Bank bank = new Bank();
        BankAccount bankAccount = new BankAccount(12345);
        BankClient bankClient = new BankClient();

        bankClient.run();
    }
}
