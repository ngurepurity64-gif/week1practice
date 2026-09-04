import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class clothinginventorymanager {

    public static void main(String[] args) {

        // Scanner gets input from the user
        Scanner scanner = new Scanner(System.in);

        // List stores the names of clothes
        List<String> clothes = new ArrayList<>();

        // Map stores the quantity of each clothing item
        Map<String, Integer> quantities = new HashMap<>();

        // Load previously saved clothes from the file
        loadClothes(clothes, quantities);

        // Controls whether the program continues running
        boolean running = true;

        // Keep showing the menu until the user chooses Exit
        while (running) {

            System.out.println("\n=== CLOTHING INVENTORY MANAGER ===");
            System.out.println("1. Add Clothing");
            System.out.println("2. View Clothes");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");

            try {

                int choice = scanner.nextInt();

                // Option 1: Add clothing
                if (choice == 1) {

                    System.out.print("Enter clothing name: ");
                    String clothingName = scanner.next();

                    System.out.print("Enter quantity: ");

                    try {

                        int quantity = scanner.nextInt();

                        clothes.add(clothingName);
                        quantities.put(clothingName, quantity);

                        // Save the clothing to the file
                        saveClothing(clothingName, quantity);

                        System.out.println(
                                "Clothing added and saved: "
                                        + clothingName
                        );

                    } catch (InputMismatchException e) {

                        // Handle invalid quantity input
                        System.out.println(
                                "Please enter a valid number."
                        );

                        scanner.nextLine();
                    }

                }

                // Option 2: View clothes
                else if (choice == 2) {

                    if (clothes.isEmpty()) {

                        System.out.println("No clothes available.");

                    } else {

                        System.out.println("\n=== AVAILABLE CLOTHES ===");

                        // Loop through all clothing items
                        for (String clothing : clothes) {

                            System.out.println(
                                    "- " + clothing
                                            + " | Quantity: "
                                            + quantities.get(clothing)
                            );
                        }
                    }

                }

                // Option 3: Exit
                else if (choice == 3) {

                    System.out.println("Goodbye!");
                    running = false;

                }

                // Handle invalid menu choices
                else {

                    System.out.println(
                            "Invalid choice. Please choose 1-3."
                    );
                }

            } catch (InputMismatchException e) {

                // Handle text entered instead of a menu number
                System.out.println(
                        "Please enter a number."
                );

                scanner.nextLine();
            }
        }

        scanner.close();
    }

    // Save clothing information to clothes.txt
    public static void saveClothing(
            String clothingName,
            int quantity) {

        try {

            FileWriter writer =
                    new FileWriter("clothes.txt", true);

            writer.write(
                    clothingName
                            + " | Quantity: "
                            + quantity
                            + "\n"
            );

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Error saving clothing to file."
            );
        }
    }

    // Load saved clothing when the program starts
    public static void loadClothes(
            List<String> clothes,
            Map<String, Integer> quantities) {

        try {

            java.io.File file =
                    new java.io.File("clothes.txt");

            if (!file.exists()) {
                return;
            }

            Scanner fileScanner =
                    new Scanner(file);

            while (fileScanner.hasNextLine()) {

                String line =
                        fileScanner.nextLine();

                String[] parts =
                        line.split(" \\| Quantity: ");

                if (parts.length == 2) {

                    String clothingName = parts[0];
                    int quantity =
                            Integer.parseInt(parts[1]);

                    clothes.add(clothingName);
                    quantities.put(
                            clothingName,
                            quantity
                    );
                }
            }

            fileScanner.close();

        } catch (IOException | NumberFormatException e) {

            System.out.println(
                    "Error loading saved clothes."
            );
        }
    }
}