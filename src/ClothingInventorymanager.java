import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ClothingInventorymanager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Map is the single source of truth
        Map<String, Integer> quantities = new HashMap<>();

        // Load saved inventory
        loadClothes(quantities);

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

                    System.out.print("Enter clothing name: ");
                    String clothingName = scanner.next();

                    System.out.print("Enter quantity: ");

                    try {

                        int quantity = scanner.nextInt();

                        // Map stores the clothing and quantity
                        quantities.put(clothingName, quantity);

                        // Rewrite the entire file
                        saveClothes(quantities);

                        System.out.println(
                                "Clothing added and saved: "
                                        + clothingName
                        );

                    } catch (InputMismatchException e) {

                        System.out.println(
                                "Please enter a valid number."
                        );

                        scanner.nextLine();
                    }

                } else if (choice == 2) {

                    if (quantities.isEmpty()) {

                        System.out.println("No clothes available.");

                    } else {

                        System.out.println("\n=== AVAILABLE CLOTHES ===");

                        // Display directly from the Map
                        for (Map.Entry<String, Integer> entry
                                : quantities.entrySet()) {

                            System.out.println(
                                    "- " + entry.getKey()
                                            + " | Quantity: "
                                            + entry.getValue()
                            );
                        }
                    }

                } else if (choice == 3) {

                    System.out.println("Goodbye!");
                    running = false;

                } else {

                    System.out.println(
                            "Invalid choice. Please choose 1-3."
                    );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Please enter a number."
                );

                scanner.nextLine();
            }
        }

        scanner.close();
    }

    // Rewrite the entire file instead of appending
    public static void saveClothes(
            Map<String, Integer> quantities) {

        try {

            FileWriter writer =
                    new FileWriter("clothes.txt", false);

            for (Map.Entry<String, Integer> entry
                    : quantities.entrySet()) {

                writer.write(
                        entry.getKey()
                                + " | Quantity: "
                                + entry.getValue()
                                + "\n"
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Error saving clothing to file."
            );
        }
    }

    // Load saved clothing into the Map
    public static void loadClothes(
            Map<String, Integer> quantities) {

        try {

            File file =
                    new File("clothes.txt");

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