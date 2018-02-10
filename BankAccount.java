package eu.rideg;

public class BankAccount {

    // Definition of fields
    private String account;       // account number
    private double balance;     // balance
    private String customerName;  // customer name
    private String emailAddress;  // email
    private String phoneNumber;   // phone number
    // At this stage of my learning process I'm not dealing with validation of account number, or email format.

    // Definition of getters for each field
    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // Definition of setters for each field
    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method for deposit fund
    public double depositFund(double depositSum) {
        System.out.println("depositFund was called.");
        System.out.println("Balance before action was: " + balance);
        balance += depositSum;
        System.out.println("Balance after action is: " + balance);
        System.out.println("");
        return balance;
    }

    // Method for withdraw fund
    public double withdrawFund(double withdrawSum) {
        System.out.println("withdrawFund was called.");
        if ((balance - withdrawSum) < 0) {
            System.out.println("Insufficient funds");
        }   else {
            System.out.println("Balance before action was: " + balance);
            balance -= withdrawSum;
            System.out.println("Balance after action is: " + balance);
            System.out.println("");
        }
        return balance;
    }
}
