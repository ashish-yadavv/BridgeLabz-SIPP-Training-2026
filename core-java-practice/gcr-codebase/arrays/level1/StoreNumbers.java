import java.util.Scanner;

class StoreNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int MAX_SIZE = 10;
      double[] numbers = new double[MAX_SIZE];
      double total = 0.0;
      int index = 0;
      
      System.out.println("Enter numbers (0 or negative to stop, max " + MAX_SIZE + " numbers):");
      
      while (true) {
         System.out.print("Enter number " + (index + 1) + ": ");
         double userEntry = input.nextDouble();
         
         if (userEntry <= 0) {
            System.out.println("Input terminated by user.");
            break;
         }
         
         if (index == MAX_SIZE) {
            System.out.println("Maximum array size reached.");
            break;
         }
         
         numbers[index] = userEntry;
         index++;
      }
      
      System.out.println();
      
      System.out.print("Numbers entered: ");
      for (int i = 0; i < index; i++) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
      
      for (int i = 0; i < index; i++) {
         total += numbers[i];
      }
      
      System.out.println("Sum of all numbers: " + total);
      input.close();
   }
}
