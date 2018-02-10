package eu.rideg;

public class Main {

    public static void main(String[] args) {
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
        //
        // This is a challenge, defined by Tim Buchalka
        // This comment part of the code is a part of his Complete Java Master Course from www.udemy.com:
        //
        // https://www.udemy.com/java-the-complete-java-developer-course/
        //
        // I share the challenge text with his permission.
        //
        // A) CHALLENGE OF CLASSES
        //
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        //
        // A) END OF CHALLENGE OF CLASSES
        //
        // B) CHALLENGE OF CONSTRUCTORS
        //
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
        //
        // B) END OF CHALLENGE OF CONSTRUCTORS
        //
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE END
        //
        // The code with the solution is made by myself.

        System.out.println("A) CHALLENGE OF CLASSES");
        System.out.println("");

        // Creating a new object based on BankAccount class
        BankAccount joesBankAccount = new BankAccount();

        // Defining fields
        joesBankAccount.setAccount("1234-1234-1234-1234");
        joesBankAccount.setBalance(1000);
        joesBankAccount.setCustomerName("Joe");
        joesBankAccount.setEmailAddress("joe@mail.com");
        joesBankAccount.setPhoneNumber("123-45-678");

        // testing method of deposit fund
        joesBankAccount.depositFund(500);
        joesBankAccount.depositFund(1000);

        //testing method of withdraw fund
        joesBankAccount.withdrawFund(1500);
        joesBankAccount.withdrawFund(2000);


        System.out.println("");
        System.out.println("");

        System.out.println("B) CHALLENGE OF CONSTRUCTORS");
        System.out.println("");

        // Creating a new object based on VipCustomer class
        VipCustomer defaultVipCustomer = new VipCustomer();
        // Testing the values of the new default object created from vipCustomer class
        System.out.println("Default name = " + defaultVipCustomer.getCustomerName());
        System.out.println("Default credit limit  = " + defaultVipCustomer.getCreditLimit());
        System.out.println("Default e-mail address  = " + defaultVipCustomer.getEmailAddress());
        System.out.println("");

        // Creating a new object based on VipCustomer class
        VipCustomer scroogeMcDuckAccount = new VipCustomer("Scrooge McDuck", 1000000);
        // Testing the values of the new object created from vipCustomer class
        System.out.println("The credit limit of " + scroogeMcDuckAccount.getCustomerName() + " is: " + scroogeMcDuckAccount.getCreditLimit() + " USD.");
        System.out.println("The default email address of VIP customer is: " + scroogeMcDuckAccount.getEmailAddress()); // No new e-mail address was defined
        System.out.println("");

        VipCustomer tonyStark = new VipCustomer("Tony Stark", 998989, "tony@stark.com");
        System.out.println("Name = " + tonyStark.getCustomerName());
        System.out.println("Credit limit  = " + tonyStark.getCreditLimit());
        System.out.println("E-mail address  = " + tonyStark.getEmailAddress());
        System.out.println("");

    }
}
