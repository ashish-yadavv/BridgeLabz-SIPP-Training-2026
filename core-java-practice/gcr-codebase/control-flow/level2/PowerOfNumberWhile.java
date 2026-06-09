import java.util.Scanner;

class PowerOfNumberWhile {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for base number and power
      int number = input.nextInt();
      int power = input.nextInt();

      // Check for positive integers
      if (number > 0 && power > 0) {
         // Initialize result to 1 and counter to 0
         int result = 1;
         int counter = 0;

         // Loop until counter equals power
         while (counter < power) {
            // Multiply result by the number
            result *= number;
            // Increment counter
            counter++;
         }

         // Display the result
         System.out.println(number + " raised to power " + power + " is: " + result);
      } else {
         System.out.println("Both number and power must be positive integers");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
