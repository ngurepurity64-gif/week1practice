import java.util.Scanner;
public class clothingsize {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Ask the user for a clothing size
            System.out.print("Enter clothing size: ");
            String size = input.nextLine();

            // Check the size
            if (size.equals("S")) {
                System.out.println("Small size selected.");
            } else if (size.equals("M")) {
                System.out.println("Medium size selected.");
            } else if (size.equals("L")) {
                System.out.println("Large size selected.");
            } else {
                System.out.println("Size not available.");
            }

            input.close();
        }
    }

