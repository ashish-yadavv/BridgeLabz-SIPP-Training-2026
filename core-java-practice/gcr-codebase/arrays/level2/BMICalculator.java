import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPersons = 0;
        while (true) {
            System.out.print("Enter number of persons: ");
            numberOfPersons = input.nextInt();
            if (numberOfPersons > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        double[] weight       = new double[numberOfPersons];
        double[] height       = new double[numberOfPersons];
        double[] bmi          = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        System.out.println("\nEnter weight (kg) and height (m) for each person:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            while (true) {
                System.out.print("  Weight (kg): ");
                weight[i] = input.nextDouble();
                if (weight[i] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid weight. Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("  Height (m) : ");
                height[i] = input.nextDouble();
                if (height[i] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid height. Please enter a positive value.");
                }
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n=== BMI Report ===");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n",
                          "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("-".repeat(59));

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s%n",
                              (i + 1), weight[i], height[i], bmi[i], weightStatus[i]);
        }

        input.close();
    }
}
