import java.util.Scanner;
public class ATM extends Account {
    private Scanner atmMachine;
    private Account account;
    
    public ATM(Account account, float balance, long accountNumber, String accountOwner, double deposit, double withdraw) {
        super(balance, accountNumber, accountOwner, deposit, withdraw);
        this.account = account;
    }
}
