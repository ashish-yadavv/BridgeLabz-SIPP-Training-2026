import java.util.Scanner;

class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;

        double highBonusRate = 0.05;
        double lowBonusRate  = 0.02;
        int serviceThreshold = 5;

        double[] salary         = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];

        double[] newSalary   = new double[totalEmployees];
        double[] bonusAmount = new double[totalEmployees];

        double totalBonus    = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("=== Zara Employee Bonus Calculator ===\n");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("--- Employee " + (i + 1) + " ---");

            while (true) {
                System.out.print("  Enter salary: ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid salary. Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("  Enter years of service: ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("  Invalid years of service. Please enter a non-negative value.");
                }
            }
        }

        System.out.println("\n=== Employee Bonus Summary ===");
        System.out.printf("%-10s %-15s %-18s %-12s %-15s%n",
                          "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-".repeat(70));

        for (int i = 0; i < totalEmployees; i++) {
            double bonusRate = (yearsOfService[i] > serviceThreshold) ? highBonusRate : lowBonusRate;

            bonusAmount[i] = salary[i] * bonusRate;
            newSalary[i]   = salary[i] + bonusAmount[i];

            totalBonus     += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];

            System.out.printf("%-10d %-15.2f %-18.1f %-12.2f %-15.2f%n",
                              (i + 1), salary[i], yearsOfService[i], bonusAmount[i], newSalary[i]);
        }

        System.out.println("-".repeat(70));
        System.out.printf("\nTotal Old Salary  : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary  : %.2f%n", totalNewSalary);

        input.close();
    }
}
