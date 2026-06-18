package scenario;

import java.io.*;
import java.util.*;

/**
 * Problem 1: School Result Portal
 * Reads student names and marks from a text file,
 * computes averages, and writes a formatted report card to a new file.
 */
public class SchoolResultPortal {

    private static final String INPUT_FILE  = "students.txt";
    private static final String OUTPUT_FILE = "report_card.txt";

    public static void main(String[] args) {

        // Create a sample input file first (for demo purposes)
        createSampleInputFile();

        // Process and generate report card
        generateReportCard();

        // Extend: append new results without overwriting
        appendNewResult("Eve", new int[]{78, 92, 85});
    }

    /** Creates a sample students.txt for demonstration */
    private static void createSampleInputFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
            writer.write("Alice,85,90,78,92,88");
            writer.newLine();
            writer.write("Bob,70,65,80,75,72");
            writer.newLine();
            writer.write("Charlie,95,98,92,97,99");
            writer.newLine();
            writer.write("Diana,60,55,70,65,58");
            writer.newLine();
            System.out.println("Sample input file '" + INPUT_FILE + "' created.");
        } catch (IOException e) {
            System.err.println("Error creating input file: " + e.getMessage());
        }
    }

    /** Reads students.txt and writes a formatted report card */
    private static void generateReportCard() {
        List<String[]> students = new ArrayList<>();

        // --- READ ---
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    students.add(line.split(","));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
            return;                        // Graceful handling
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // --- WRITE ---
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            writer.write("========================================");
            writer.newLine();
            writer.write("           STUDENT REPORT CARD          ");
            writer.newLine();
            writer.write("========================================");
            writer.newLine();

            for (String[] parts : students) {
                String name    = parts[0].trim();
                double total   = 0;
                int    count   = parts.length - 1;

                for (int i = 1; i < parts.length; i++) {
                    total += Double.parseDouble(parts[i].trim());
                }

                double average = total / count;
                String grade   = getGrade(average);

                String line = String.format("%-12s | Avg: %6.2f | Grade: %s", name, average, grade);
                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }

            writer.write("========================================");
            writer.newLine();
            System.out.println("\nReport card written to '" + OUTPUT_FILE + "'.");

        } catch (IOException e) {
            System.err.println("Error writing report card: " + e.getMessage());
        }
    }

    /** Appends a new student result without overwriting existing data */
    public static void appendNewResult(String name, int[] marks) {
        // FileWriter(file, true) opens in append mode
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE, true))) {
            double total = 0;
            for (int m : marks) total += m;
            double average = total / marks.length;
            String grade   = getGrade(average);

            String line = String.format("%-12s | Avg: %6.2f | Grade: %s  [APPENDED]", name, average, grade);
            writer.write(line);
            writer.newLine();
            System.out.println("Appended new result for " + name);
        } catch (IOException e) {
            System.err.println("Error appending result: " + e.getMessage());
        }
    }

    private static String getGrade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        return "F";
    }
}
