import java.util.Scanner;

class SumNaturalNumbersFor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = input.nextInt();

      if (number > 0) {
         int sumFormula = number * (number + 1) / 2;

         int sumLoop = 0;
         for (int i = 1; i <= number; i++) {
            sumLoop += i;
         }

         boolean isCorrect = (sumFormula == sumLoop);

         System.out.println("Sum using formula: " + sumFormula);
         System.out.println("Sum using for loop: " + sumLoop);
         System.out.println("Both computations were correct: " + isCorrect);
      } else {
         System.out.println("The number " + number + " is not a natural number");
      }

      input.close();
   }
}
