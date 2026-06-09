import java.util.Scanner;

class MultiplicationTable {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = input.nextInt();

      for (int i = 6; i <= 9; i++) {
         int product = number * i;
         System.out.println(number + " * " + i + " = " + product);
      }

      input.close();
   }
}
