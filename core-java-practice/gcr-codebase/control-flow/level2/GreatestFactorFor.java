import java.util.Scanner;

class GreatestFactorFor {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Initialize greatestFactor to 1
      int greatestFactor = 1;

      // Loop from number - 1 down to 1
      for (int i = number - 1; i >= 1; i--) {
         // Check if i perfectly divides the number
         if (number % i == 0) {
            // Assign i as greatest factor and break
            greatestFactor = i;
            break;
         }
      }

      // Display the greatest factor
      System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);

      // Closing the Scanner Stream
      input.close();
   }
}
