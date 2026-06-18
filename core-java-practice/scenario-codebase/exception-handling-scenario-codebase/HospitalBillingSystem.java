import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] patientIds = {101, 102, 103};

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());
            int totalBill = 5000;
            int numItems = Integer.parseInt(sc.nextLine());
            int itemPrice = totalBill / numItems;
            System.out.println("Patient ID: " + patientIds[index]);
            System.out.println("Item price: " + itemPrice);

            double balance = 3000;
            if (balance < totalBill) {
                throw new InsufficientFundsException("Balance " + balance + " is less than bill " + totalBill);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input. " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }
    }
}
