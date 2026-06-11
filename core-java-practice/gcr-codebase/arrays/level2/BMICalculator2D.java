import java.util.Scanner;

class BMICalculator2D {
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

        double[][] personData  = new double[numberOfPersons][3];
        String[]   weightStatus = new String[numberOfPersons];

        int COL_WEIGHT = 0;
        int COL_HEIGHT = 1;
        int COL_BMI    = 2;

        System.out.println("\nEnter weight (kg) and height (m) for each person:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            while (true) {
                System.out.print("  Weight (kg): ");
                personData[i][COL_WEIGHT] = input.nextDouble();
                if (personData[i][COL_WEIGHT] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid weight. Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("  Height (m) : ");
                personData[i][COL_HEIGHT] = input.nextDouble();
                if (personData[i][COL_HEIGHT] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid height. Please enter a positive value.");
                }
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {
            personData[i][COL_BMI] = personData[i][COL_WEIGHT] /
                                     (personData[i][COL_HEIGHT] * personData[i][COL_HEIGHT]);

            if (personData[i][COL_BMI] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][COL_BMI] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][COL_BMI] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n=== BMI Report (2D Array) ===");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n",
                          "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("-".repeat(59));

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s%n",
                              (i + 1),
                              personData[i][COL_WEIGHT],
                              personData[i][COL_HEIGHT],
                              personData[i][COL_BMI],
                              weightStatus[i]);
        }

        input.close();
    }
}
