import java.util.Scanner;
public class ATM extends Account {
    private Scanner in;
    
    public ATM(float balance, long accountNumber, int pin, int phoneNum, String name, int ssn, String birthdate, String address, double deposit, double withdraw) {
        super(balance, accountNumber, deposit, withdraw, pin, phone, ssn, birthdate, address);
    }
    
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        in.close();
    }
    
    public static void menu() {
        User.getName();
        System.out.println("Hello, " + User.getName() + "."\n"Press d to deposit, w to withdraw, b to show balance, and e to exit your account.")
        char option = in.nextChar();
            if (Account.setAccountNumber() == true) {
            User.getPin();
            While (option != 'e') {
                if (User.getPin() == true) {
                    if (option = 'd') {
                        Account.setDeposit();
                    }
                    else if (option = 'w') {
                        Account.setWithdraw();
                    }
                    else if (option = 'b') {
                        Account.setBalance();
                    }
                    else {
                        System.out.println("Not valid command.");
                    }
                }
                if (option == 'e') {
                    System.out.println("Thank you and have a good day, " + User.getName());
                }
                else {
                System.out.println("Enter correct pin.");
                }
            }        
        }
    }
