import java.util.Scanner;

class FizzBuzzWhile {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {
         // Initialize counter
         int i = 1;

         // Loop from 1 to the number
         while (i <= number) {
            // Check for multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
               System.out.println("Fizz");
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
               System.out.println("Buzz");
            }
            // Print the number otherwise
            else {
               System.out.println(i);
            }
            // Increment counter
            i++;
         }
      } else {
         System.out.println("The number " + number + " is not a positive integer");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
