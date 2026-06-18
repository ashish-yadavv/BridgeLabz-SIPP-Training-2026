package additional;

import java.io.*;
import java.util.*;

/**
 * Additional Problem 2: Email Domain Counter
 * Reads employee emails from a file, extracts domains using String methods,
 * and counts how many users use Gmail, Yahoo, etc.
 */
public class EmailDomainCounter {

    private static final String EMAIL_FILE = "emails.txt";

    public static void main(String[] args) {

        // Create sample email file
        createSampleEmailFile();

        // Analyze domains
        countDomains();
    }

    private static void createSampleEmailFile() {
        String[] emails = {
            "rahul@gmail.com",
            "ankit@yahoo.com",
            "priya@gmail.com",
            "suresh@outlook.com",
            "neha@yahoo.com",
            "amit@gmail.com",
            "kavya@hotmail.com"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(EMAIL_FILE))) {
            for (String email : emails) {
                writer.write(email);
                writer.newLine();
            }
            System.out.println("Sample email file '" + EMAIL_FILE + "' created.");
        } catch (IOException e) {
            System.err.println("Error creating email file: " + e.getMessage());
        }
    }

    private static void countDomains() {
        List<String>        domains     = new ArrayList<>();
        Map<String, Integer> domainCount = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(EMAIL_FILE))) {
            String line;
            System.out.println("\n--- Reading Emails ---");

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                System.out.println(line);

                // Extract domain using String methods
                int atIndex = line.indexOf('@');
                if (atIndex != -1 && atIndex < line.length() - 1) {
                    String domain = line.substring(atIndex + 1).toLowerCase();  // e.g. "gmail.com"
                    domains.add(domain);

                    // Count occurrences
                    domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Email file not found: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println("Error reading email file: " + e.getMessage());
            return;
        }

        // Display results
        System.out.println("\n--- Domain Count Summary ---");
        for (Map.Entry<String, Integer> entry : domainCount.entrySet()) {
            System.out.printf("%-20s : %d user(s)%n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nAll domains array: " + domains);
    }
}
