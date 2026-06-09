import java.util.Scanner;

class SumUntilZero {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double total = 0.0;

      System.out.print("Enter a number (0 to stop): ");
      double userValue = input.nextDouble();

      while (userValue != 0) {
         total += userValue;
         System.out.print("Enter a number (0 to stop): ");
         userValue = input.nextDouble();
      }

      System.out.println("Sum of entered numbers: " + total);

      input.close();
   }
}
