/**
 * This class represents a simple bank account
 *
 * @author Suna Aregay
 * @version 1.0
 * @link </https://github.com/suna2km/JavaBankApp>
 */
public class Account {

    private static int lastId = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private double balance;

    /**
     * Default Constructor
     * Creates account with an ID, first & last name and balance
     */
    public Account() {

        this.id = lastId++;
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.balance = 0.0;
    }

    /**
     * Constructs an account with the first and last names
     * @param firstName the account owner's first name
     * @param lastName the account owner's last name
     */
    public Account(String firstName, String lastName) {
        this();

        setFirstName(firstName);
        setLastName(lastName);

    }
    /**
     * Returns the current account balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Returns the account ID.
     *
     * @return the unique account ID
     */
    public int getId() {
        return id;
    }
    /**
     * Returns the account owner's first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Returns the account owner's last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Allow setting of the account owner's first name.
     *
     * @param firstName account owner's first name
     * @throws IllegalArgumentException ("Invalid first name! Name can't be blank for id: " + id)
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name! Name can't be blank for id: " + id);
        }
        this.firstName = firstName;
    }

    /**
     * Allow setting of the account owner's last name.
     *
     * @param lastName account owner's last name
     * @throws IllegalArgumentException ("Invalid last name! Name can't be blank for id: " + id)
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        }
        this.lastName = lastName;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is less than or equal to zero
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount can't be negative or zero!");
        }
        this.balance += amount;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is less than or equal to zero
     * or the amount exceeds the current balance.
     */
    public void withdrawal(double amount) {
        if (amount <= 0 ){
            throw new IllegalArgumentException("Invalid amount [" + amount + "]! Amount has to be greater than zero.");
        }
        else if (amount > balance) {
            throw new IllegalArgumentException("Invalid amount ["+ amount + "]! Amount can not be greater than balance [" + balance +"].");
        }
        this.balance -= amount;
    }

    /**
     * Returns a formatted string representation of the account.
     *
     * @return formatted account string in the form:
     *         "#ID: FirstName LastName"
     */
    @Override
    public String toString() {
        return "#" + id + ": " + firstName + " " + lastName;
    }
}
