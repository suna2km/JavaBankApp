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

        setFirstName(firstName);
        setLastName(lastName);

    }

    public double getBalance() {
        return balance;
    }

    public static int getLastId() {
        return lastId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name! Name can't be blank for id: " + id);
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("invalid last name! Name can't be blank for id: " + id);
        }
        this.lastName = lastName;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount can't be negative or zero!");
        }
        this.balance += amount;
    }
    public void withdrawal(double amount) {
        if (amount <= 0 ){
            throw new IllegalArgumentException("invalid amount! Amount can't be negative!");
        }
        else if (amount > balance) {
            throw new IllegalArgumentException("invalid amount! Amount can't be greater than balance!");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
