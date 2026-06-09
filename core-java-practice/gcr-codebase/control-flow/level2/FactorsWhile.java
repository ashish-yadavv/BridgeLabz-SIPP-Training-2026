import java.util.Scanner;

class FactorsWhile {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {
         System.out.print("Factors of " + number + ": ");

         // Initialize counter
         int i = 1;

         // Loop from 1 to number
         while (i <= number) {
            // Check if i perfectly divides the number
            if (number % i == 0) {
               System.out.print(i + " ");
            }
            // Increment counter
            i++;
         }
         System.out.println();
      } else {
         System.out.println("The number " + number + " is not a positive integer");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
