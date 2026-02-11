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
