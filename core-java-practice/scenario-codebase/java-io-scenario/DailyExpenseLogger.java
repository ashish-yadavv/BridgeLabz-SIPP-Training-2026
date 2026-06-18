package scenario;

import java.io.*;
import java.util.Scanner;

/**
 * Problem 3: Daily Expense Logger
 * Accepts expense details from user and appends them to expenses.txt
 * Each new entry is appended without deleting previous data.
 */
public class DailyExpenseLogger {

    private static final String EXPENSE_FILE = "expenses.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Daily Expense Logger =====");
        System.out.println("Enter expense details (type 'done' to stop)");
        System.out.println("Format: CategoryName Amount  (e.g., Food 200)");
        System.out.println("================================\n");

        boolean hasEntries = false;

        while (true) {
            System.out.print("Enter category (or 'done'): ");
            String category = scanner.nextLine().trim();

            if (category.equalsIgnoreCase("done")) {
                break;
            }

            if (category.isEmpty()) {
                System.out.println("Category cannot be empty. Try again.");
                continue;
            }

            System.out.print("Enter amount: ");
            String amountStr = scanner.nextLine().trim();

            double amount;
            try {
                amount = Double.parseDouble(amountStr);
                if (amount < 0) {
                    System.out.println("Amount cannot be negative. Try again.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a number.");
                continue;
            }

            // Append to expenses.txt (true = append mode)
            appendExpense(category, amount);
            hasEntries = true;
            System.out.println("✓ Saved: " + category + " - " + (int) amount + "\n");
        }

        scanner.close();

        if (hasEntries) {
            System.out.println("\n--- All saved expenses in " + EXPENSE_FILE + " ---");
            readAndDisplayExpenses();
        } else {
            System.out.println("No expenses were entered.");
        }
    }

    /** Appends a single expense entry to the file */
    private static void appendExpense(String category, double amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(EXPENSE_FILE, true))) {
            // Format: Food - 200
            writer.write(category + " - " + (int) amount);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving expense: " + e.getMessage());
        }
    }

    /** Reads and displays all expenses from the file */
    private static void readAndDisplayExpenses() {
        try (BufferedReader reader = new BufferedReader(new FileReader(EXPENSE_FILE))) {
            String line;
            double total = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Parse amount for total
                try {
                    String[] parts = line.split("-");
                    if (parts.length == 2) {
                        total += Double.parseDouble(parts[1].trim());
                    }
                } catch (NumberFormatException ignored) {}
            }
            System.out.println("--------------------------------");
            System.out.println("Total Expenses: " + (int) total);
        } catch (FileNotFoundException e) {
            System.out.println("No expense file found yet.");
        } catch (IOException e) {
            System.err.println("Error reading expenses: " + e.getMessage());
        }
    }
}
