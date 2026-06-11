import java.util.Scanner;

class NumberCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int ARRAY_SIZE = 5;
      int[] numbers = new int[ARRAY_SIZE];
      
      System.out.println("Enter " + ARRAY_SIZE + " numbers:");
      for (int i = 0; i < numbers.length; i++) {
         System.out.print("Number " + (i + 1) + ": ");
         numbers[i] = input.nextInt();
      }
      
      System.out.println();
      
      for (int i = 0; i < numbers.length; i++) {
         int currentNumber = numbers[i];
         if (currentNumber > 0) {
            if (currentNumber % 2 == 0) {
               System.out.println(currentNumber + " is positive and even.");
            } else {
               System.out.println(currentNumber + " is positive and odd.");
            }
         } else if (currentNumber < 0) {
            System.out.println(currentNumber + " is negative.");
         } else {
            System.out.println(currentNumber + " is zero.");
         }
      }
      
      System.out.println();
      
      int firstElement = numbers[0];
      int lastElement = numbers[numbers.length - 1];
      
      System.out.print("First element (" + firstElement + ") is ");
      if (firstElement == lastElement) {
         System.out.println("equal to the last element (" + lastElement + ").");
      } else if (firstElement > lastElement) {
         System.out.println("greater than the last element (" + lastElement + ").");
      } else {
         System.out.println("less than the last element (" + lastElement + ").");
      }
      
      input.close();
   }
}
