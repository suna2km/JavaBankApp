public class Account {

    private static int lastId = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {

        this.id = lastId++;
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.balance = 0.0;
    }
    public Account(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        return
    }
}
