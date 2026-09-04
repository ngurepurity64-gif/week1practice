import java.util.Scanner;
public class passwordcheck {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Ask the user to enter a password
            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Check whether the password is correct
            if (password.equals("java123")) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Access denied.");
            }

            input.close();
        }
    }

