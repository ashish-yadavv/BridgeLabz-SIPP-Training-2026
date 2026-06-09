import java.util.Scanner;

class MultiplesBelow100 {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Check if the number is a positive integer and less than 100
      if (number > 0 && number < 100) {
         System.out.print("Multiples of " + number + " below 100: ");

         // Loop backward from 100 to 1
         for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
               System.out.print(i + " ");
            }
         }
         System.out.println();
      } else {
         System.out.println("The number " + number + " is not a positive integer less than 100");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
