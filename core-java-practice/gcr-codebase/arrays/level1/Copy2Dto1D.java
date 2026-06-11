import java.util.Scanner;

class Copy2Dto1D {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number of rows: ");
      int rows = input.nextInt();
      
      System.out.print("Enter number of columns: ");
      int columns = input.nextInt();
      
      if (rows <= 0 || columns <= 0) {
         System.err.println("Error: Rows and columns must be positive.");
         System.exit(0);
      }
      
      int[][] matrix = new int[rows][columns];
      
      System.out.println("Enter the elements of the matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print("Element [" + i + "][" + j + "]: ");
            matrix[i][j] = input.nextInt();
         }
      }
      
      int[] oneDArray = new int[rows * columns];
      int index = 0;
      
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            oneDArray[index] = matrix[i][j];
            index++;
         }
      }
      
      System.out.println();
      System.out.println("Original 2D Matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
      
      System.out.println();
      System.out.print("Copied 1D Array: ");
      for (int i = 0; i < oneDArray.length; i++) {
         System.out.print(oneDArray[i] + " ");
      }
      System.out.println();
      
      input.close();
   }
}
