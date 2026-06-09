import java.util.Scanner;

class MultiplesBelow100While {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Check if the number is a positive integer and less than 100
      if (number > 0 && number < 100) {
         System.out.print("Multiples of " + number + " below 100: ");

         // Initialize counter to 100
         int counter = 100;

         // Loop backward from 100 to 1
         while (counter >= 1) {
            // Check if counter is a multiple of the number
            if (counter % number == 0) {
               System.out.print(counter + " ");
            }
            // Decrement counter
            counter--;
         }
         System.out.println();
      } else {
         System.out.println("The number " + number + " is not a positive integer less than 100");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
