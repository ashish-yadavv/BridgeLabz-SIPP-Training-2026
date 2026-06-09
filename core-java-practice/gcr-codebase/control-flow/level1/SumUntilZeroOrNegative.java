import java.util.Scanner;

class SumUntilZeroOrNegative {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double total = 0.0;

      while (true) {
         System.out.print("Enter a number (0 or negative to stop): ");
         double userValue = input.nextDouble();

         if (userValue <= 0) {
            break;
         }

         total += userValue;
      }

      System.out.println("Sum of entered numbers: " + total);

      input.close();
   }
}
