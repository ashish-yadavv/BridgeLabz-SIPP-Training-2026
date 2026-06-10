public class KingdomTaxSystem {
    public static void main(String[] args) {

        double[] incomes = {
            8000, 12000, 25000, 60000, 45000,
            9000, 75000, 30000, 52000, 10000
        };

        double totalTaxCollected = 0;

        System.out.println("Income\tBracket\tTax Amount");
        System.out.println("--------------------------------");

        for (double income : incomes) {
            double tax;
            String bracket;

            if (income < 10000) {
                bracket = "5%";
                tax = income * 0.05;
            } else if (income <= 50000) {
                bracket = "15%";
                tax = income * 0.15;
            } else {
                bracket = "30%";
                tax = income * 0.30;
            }

            totalTaxCollected += tax;

            System.out.println(income + "\t" + bracket + "\t" + tax);
        }

        System.out.println("--------------------------------");
        System.out.println("Total Tax Collected: " + totalTaxCollected);
    }
}