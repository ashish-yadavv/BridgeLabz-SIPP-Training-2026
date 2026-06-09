import java.util.Scanner;

class EmployeeBonus {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for salary and years of service
      double salary = input.nextDouble();
      int yearsOfService = input.nextInt();

      // Check if service is more than 5 years
      if (yearsOfService > 5) {
         // Calculate 5% bonus
         double bonus = salary * 0.05;
         System.out.println("Bonus amount: " + bonus);
      } else {
         System.out.println("Bonus amount: 0.0");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
