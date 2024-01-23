package JavaRelearn;

public class BankAccount {
    private String customerName;
    private String email;
    private long phoneNumber;
    private long accountNumber;
    private double accountBalance;

    //Constructor.
//  Constructor overloading
    public BankAccount() {
        //constructor chaining: calling a constructor from another constructor.
        this("J J.", "myemail@email.com", 8085651338L, 231445987, 300);
    }

    public BankAccount(String customerName, String email, long phoneNumber, long accountNumber, double accountBalance) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        accountCreated();
    }

    //Constructor chaining: Can be used to initialise default value when they are not going to be instantiated by the caller.
    //Here we use a default account number and balance. Because the caller will not set this one. When the constructor is called,
    // the caller will be able to instantiate just three fields: customerName, email, and phoneNumber.
    public BankAccount(String customerName, String email, long phoneNumber) {
        this(customerName, email, phoneNumber, 231445678, 0.00);
    }

    //METHODS

    private void accountCreated(){
        System.out.println("Hi " + customerName + " Guess what.. your account has been created!\nYour new account number is " + accountNumber + " and your current balance is $" + accountBalance + ".\nThank you for choosing us :)");
    }

    public void depositFunds(double amount){
        if(amount > 0)
            //add code to confirm from the service that the transfer was successful.
            this.accountBalance += amount;

        System.out.println("Account successfully credited with $" + amount +"\nYour new account balance is $" + accountBalance);
    }

    public void withdrawFunds(double amount){
        if (this.accountBalance - amount > 0){
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful! Flenjo. What is life but a series of moments?");
            System.out.println("Your new account balance is $" + accountBalance);
        }

        else
            System.out.println("Oops. Seems like you don't have that much. Please fund your account " + accountNumber + " with your card or any of our online services to withdraw\nYou only have $" +accountBalance + " in your account.");
    }

//GETTERS.

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //SETTERS

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }


}
