import java.util.Scanner;

class MultiplicationTable {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int TABLE_START = 1;
      final int TABLE_END = 10;
      final int TABLE_SIZE = TABLE_END - TABLE_START + 1;
      
      System.out.print("Enter a number to print its multiplication table: ");
      int number = input.nextInt();
      int[] multiplicationResult = new int[TABLE_SIZE];
      
      for (int i = 0; i < multiplicationResult.length; i++) {
         int multiplier = i + 1;
         multiplicationResult[i] = number * multiplier;
      }
      
      System.out.println();
      System.out.println("Multiplication Table of " + number + ":");
      for (int i = 0; i < multiplicationResult.length; i++) {
         int multiplier = i + 1;
         System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
      }
      
      input.close();
   }
}
