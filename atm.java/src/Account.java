public class Account extends User {
    private float balance;
    private long accountNumber;
    private User user;
    private String accountOwner;
    private double withdraw;
    private double deposit;
    
    public Account (float balance, long accountNumber, User user, String accountOwner, double withdraw, double deposit, int pin, int phone, String birthdate, String address) {
        super(pin, phone, birthdate, address);
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.user = user;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }
    
    public float getBalance() {
        return balance;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountOwner() {
        return accountOwner;
    }
    
    public double getWithdraw() {
        return withdraw;
    }
    
    public double getDeposit() {
        return deposit;
    }
    
    public float setBalance() {
        this.balance = balance;
    }
    
    public long setAccountNumber() {
        this.accountNumber = accountNumber;
    }
    
    public String setAccountOwner() {
        this.accountOwner = accountNumber;
    }
    
    public double setWithdraw() {
        this.withdraw = withdraw;
    }
    
    public double setDeposit() {
        this.deposit = deposit;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            return 0;
        }
        
        else {
            balance = balance + amount;
            return 1;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            return 0;
        }
        
        else if (amount <= 0) {
            return 1;
        }
        
        else {
            balance = balance - amount;
            return 2;
        }
    }
}
