import java.util.Scanner;
public class ATM extends Account {
    private Scanner input;
    private Account account;
    
    Scanner input = new Scanner(System.input);
    public static void main(String[] args) {
        ATM atm = new ATM();
        
    }
    
    public ATM(Account account, float balance, long accountNumber, String accountOwner, double deposit, double withdraw) {
        super(balance, accountNumber, accountOwner, deposit, withdraw);
        this.account = account;
    }
    
    public menu() {
        
    }
}
