package scenario;

import java.io.*;

/**
 * Problem 2: Customer Feedback Analyzer
 * Reads 5 feedback messages using BufferedReader and
 * counts how many contain the word "good" (case-insensitive).
 */
public class CustomerFeedbackAnalyzer {

    private static final String FEEDBACK_FILE = "feedback.txt";

    public static void main(String[] args) {

        // Create sample feedback file
        createSampleFeedbackFile();

        // Analyze feedback
        analyzeFeedback();
    }

    private static void createSampleFeedbackFile() {
        String[] feedbacks = {
            "Good service",
            "delivery was good",
            "average",
            "good packaging",
            "late delivery"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FEEDBACK_FILE))) {
            for (String feedback : feedbacks) {
                writer.write(feedback);
                writer.newLine();
            }
            System.out.println("Sample feedback file created.");
        } catch (IOException e) {
            System.err.println("Error creating feedback file: " + e.getMessage());
        }
    }

    private static void analyzeFeedback() {
        int goodCount = 0;
        int totalRead = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(FEEDBACK_FILE))) {
            String line;

            System.out.println("\n--- Reading Feedback Messages ---");
            while ((line = reader.readLine()) != null && totalRead < 5) {
                totalRead++;
                System.out.println(totalRead + ": " + line);

                // Case-insensitive check for word "good"
                if (line.toLowerCase().contains("good")) {
                    goodCount++;
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Feedback file not found: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println("Error reading feedback: " + e.getMessage());
            return;
        }

        System.out.println("\nGood Feedback Count = " + goodCount);
    }
}
