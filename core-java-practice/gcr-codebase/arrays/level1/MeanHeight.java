import java.util.Scanner;

class MeanHeight {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int TOTAL_PLAYERS = 11;
      double[] heights = new double[TOTAL_PLAYERS];
      
      System.out.println("Enter the heights of " + TOTAL_PLAYERS + " football players (in cm):");
      for (int i = 0; i < heights.length; i++) {
         System.out.print("Player " + (i + 1) + " height: ");
         heights[i] = input.nextDouble();
      }
      
      double sum = 0.0;
      for (int i = 0; i < heights.length; i++) {
         sum += heights[i];
      }
      
      double meanHeight = sum / TOTAL_PLAYERS;
      
      System.out.println();
      System.out.println("Sum of heights: " + sum + " cm");
      System.out.println("Mean height of the football team: " + meanHeight + " cm");
      
      input.close();
   }
}
