package additional;

import java.io.*;

/**
 * Additional Problem 3: Product Inventory Checker
 * Reads an inventory file, separates product name and quantity,
 * and prints out-of-stock items (quantity == 0).
 */
public class ProductInventoryChecker {

    private static final String INVENTORY_FILE = "inventory.txt";

    public static void main(String[] args) {

        // Create sample inventory file
        createSampleInventoryFile();

        // Check and display out-of-stock items
        checkInventory();
    }

    private static void createSampleInventoryFile() {
        String[] items = {
            "Laptop-10",
            "Mouse-0",
            "Keyboard-5",
            "Monitor-0",
            "Headphones-3",
            "Webcam-0"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INVENTORY_FILE))) {
            for (String item : items) {
                writer.write(item);
                writer.newLine();
            }
            System.out.println("Sample inventory file '" + INVENTORY_FILE + "' created.");
        } catch (IOException e) {
            System.err.println("Error creating inventory file: " + e.getMessage());
        }
    }

    private static void checkInventory() {
        System.out.println("\n--- Inventory Status ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
            String line;
            boolean anyOutOfStock = false;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                // Separate product name and quantity using '-' delimiter
                int dashIndex = line.lastIndexOf('-');
                if (dashIndex == -1) {
                    System.out.println("Invalid format: " + line);
                    continue;
                }

                String productName = line.substring(0, dashIndex).trim();
                String quantityStr = line.substring(dashIndex + 1).trim();

                try {
                    int quantity = Integer.parseInt(quantityStr);
                    System.out.printf("%-15s : %d%n", productName, quantity);

                    if (quantity == 0) {
                        System.out.println(productName + " is out of stock");
                        anyOutOfStock = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid quantity for: " + productName);
                }
            }

            if (!anyOutOfStock) {
                System.out.println("All products are in stock.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Inventory file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading inventory: " + e.getMessage());
        }
    }
}
