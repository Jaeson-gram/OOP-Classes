package JavaRelearn;

public class Customer {
    private String customerName;
    private String emailAddress;
    private int creditLimit;


    public Customer() {
        this("Someone ", "someone@mail.com", 79);
    }

    public Customer(String customerName, String emailAddress, int creditLimit) {
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public Customer(String customerName, String emailAddress) {
        this(customerName, emailAddress, 89);
    }

    public void getCustomerDetails(){
        System.out.println("Customer Name\t - \t" + customerName + "\nCredit Score\t - \t" + creditLimit + "\nEmail\t - \t" + emailAddress);
    }
    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
