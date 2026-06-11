import java.util.Scanner;

class MultiplicationTable6to9 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int TABLE_START = 6;
      final int TABLE_END = 9;
      final int TABLE_SIZE = TABLE_END - TABLE_START + 1;
      
      System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
      int number = input.nextInt();
      int[] multiplicationResult = new int[TABLE_SIZE];
      
      for (int i = 0; i < multiplicationResult.length; i++) {
         int multiplier = i + TABLE_START;
         multiplicationResult[i] = number * multiplier;
      }
      
      System.out.println();
      System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
      for (int i = 0; i < multiplicationResult.length; i++) {
         int multiplier = i + TABLE_START;
         System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
      }
      
      input.close();
   }
}
