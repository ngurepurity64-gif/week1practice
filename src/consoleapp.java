import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class consoleapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> products = new ArrayList<>();
        Map<String, Integer> quantities = new HashMap<>();

        boolean running = true;

        while (running) {

            System.out.println("\n=== INVENTORY MANAGER ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 1) {

                    System.out.print("Enter product name: ");
                    String productName = scanner.next();

                    System.out.print("Enter quantity: ");

                    try {
                        int quantity = scanner.nextInt();

                        products.add(productName);
                        quantities.put(productName, quantity);

                        System.out.println("Product added: " + productName);

                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number.");
                        scanner.nextLine();
                    }

                } else if (choice == 2) {

                    if (products.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("Products:");

                        for (String product : products) {
                            System.out.println(
                                    "- " + product +
                                            " | Quantity: " +
                                            quantities.get(product)
                            );
                        }
                    }

                } else if (choice == 3) {

                    System.out.println("Goodbye!");
                    running = false;

                } else {

                    System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter a number.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

