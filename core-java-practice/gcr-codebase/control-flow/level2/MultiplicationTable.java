import java.util.Scanner;

class MultiplicationTable {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for the number
      int number = input.nextInt();

      // Loop from 6 to 9 for multiplication table
      for (int i = 6; i <= 9; i++) {
         // Calculate product
         int product = number * i;
         System.out.println(number + " * " + i + " = " + product);
      }

      // Closing the Scanner Stream
      input.close();
   }
}
