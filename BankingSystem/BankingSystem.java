import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("WELCOME TO WORLD BANK!!");

        Scanner s  = new Scanner(System.in);
        String choice = "";

        while(!choice.equals("q")) {
            System.out.println("\n===== MENU =====");
            System.out.println("(a). Create New Account\n(q). Quit");
            choice = s.nextLine();
            switch (choice) {
                case "a":
                    System.out.println("\nCreating user account");
                    break;
                case "q":
                    System.out.println("\nExiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, Please try again");
            }
        }
        s.close();
    }
}
