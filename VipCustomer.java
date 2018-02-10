package eu.rideg;

public class VipCustomer {
    private String customerName;    // customer name
    private double creditLimit;     // credit limit
    private String emailAddress;    // e-mail address


    // 1st constructor for default values
    public VipCustomer() {
        this("Default VIP customer name", 999999, "old_default_vip@mail.com");
        System.out.println("First constructor with default values was called.");
    }

    // 2nd constructor with two values and default value for 3rd field
    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "new_default_vip@mail.com");
    }

    // 3rd constructor for saving all fields
    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    // Definition of getters
    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    // Setters are not necessary
}
