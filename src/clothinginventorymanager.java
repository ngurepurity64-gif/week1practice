import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

    public class clothinginventorymanager {

        public static void main(String[] args) {

            // Get input from the user
            Scanner scanner = new Scanner(System.in);

            // List stores the clothing names
            List<String> clothes = new ArrayList<>();

            // Map stores the quantity of each clothing item
            Map<String, Integer> quantities = new HashMap<>();

            // Keeps the program running until the user chooses Exit
            boolean running = true;

            while (running) {

                System.out.println("\n=== CLOTHING INVENTORY MANAGER ===");
                System.out.println("1. Add Clothing");
                System.out.println("2. View Clothes");
                System.out.println("3. Exit");

                System.out.print("Choose an option: ");

                try {
                    int choice = scanner.nextInt();

                    if (choice == 1) {

                        // Add a clothing item
                        System.out.print("Enter clothing name: ");
                        String clothingName = scanner.next();

                        System.out.print("Enter quantity: ");

                        try {
                            int quantity = scanner.nextInt();

                            clothes.add(clothingName);
                            quantities.put(clothingName, quantity);

                            System.out.println("Clothing added: " + clothingName);

                        } catch (InputMismatchException e) {

                            // Handle invalid quantity
                            System.out.println("Please enter a valid number.");
                            scanner.nextLine();
                        }

                    } else if (choice == 2) {

                        // Display available clothes
                        if (clothes.isEmpty()) {

                            System.out.println("No clothes available.");

                        } else {

                            System.out.println("Clothes available:");

                            for (String clothing : clothes) {

                                System.out.println(
                                        "- " + clothing +
                                                " | Quantity: " +
                                                quantities.get(clothing)
                                );
                            }
                        }

                    } else if (choice == 3) {

                        // Exit the program
                        System.out.println("Goodbye!");
                        running = false;

                    } else {

                        // Handle an invalid menu option
                        System.out.println("Invalid choice.");
                    }

                } catch (InputMismatchException e) {

                    // Handle text entered instead of a menu number
                    System.out.println("Please enter a number.");
                    scanner.nextLine();
                }
            }

            scanner.close();
        }
    }

