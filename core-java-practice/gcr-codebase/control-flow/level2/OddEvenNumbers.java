import java.util.Scanner;

class OddEvenNumbers {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Check if the number is a natural number
      if (number > 0) {
         // Loop from 1 to the number
         for (int i = 1; i <= number; i++) {
            // Check if current number is even
            if (i % 2 == 0) {
               System.out.println(i + " is an even number");
            } else {
               System.out.println(i + " is an odd number");
            }
         }
      } else {
         System.out.println("The number " + number + " is not a natural number");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
