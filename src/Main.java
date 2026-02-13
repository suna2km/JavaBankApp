/**
 * The Main class is used to test the Account class.
 * This program creates Account objects and then displays each account's ID,
 * first name, and last name to verify that the constructors and accessor
 * methods work correctly.
 * A try-catch block is used to handle thrown errors
 *
 * @author Suna Aregay
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            Account a1 = new Account();
            Account a2 = new Account("John", "Doe");
            System.out.println(a1.getId());
            System.out.println(a1.getFirstName());
            System.out.println(a1.getLastName());

            System.out.println();

            System.out.println(a2.getId());
            System.out.println(a2.getFirstName());
            System.out.println(a2.getLastName());

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
