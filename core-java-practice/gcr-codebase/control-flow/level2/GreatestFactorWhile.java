import java.util.Scanner;

class GreatestFactorWhile {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Initialize greatestFactor to 1
      int greatestFactor = 1;

      // Initialize counter to number - 1
      int counter = number - 1;

      // Loop from counter down to 1
      while (counter >= 1) {
         // Check if counter perfectly divides the number
         if (number % counter == 0) {
            // Assign counter as greatest factor and break
            greatestFactor = counter;
            break;
         }
         // Decrement counter
         counter--;
      }

      // Display the greatest factor
      System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);

      // Closing the Scanner Stream
      input.close();
   }
}
