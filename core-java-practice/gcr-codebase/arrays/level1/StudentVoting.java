import java.util.Scanner;

class StudentVoting {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int TOTAL_STUDENTS = 10;
      int[] studentAges = new int[TOTAL_STUDENTS];
      
      System.out.println("Enter the age of " + TOTAL_STUDENTS + " students:");
      for (int i = 0; i < studentAges.length; i++) {
         System.out.print("Student " + (i + 1) + " age: ");
         studentAges[i] = input.nextInt();
      }
      
      System.out.println();
      
      for (int i = 0; i < studentAges.length; i++) {
         int currentAge = studentAges[i];
         if (currentAge < 0) {
            System.out.println("Student " + (i + 1) + ": Invalid age.");
         } else if (currentAge >= 18) {
            System.out.println("The student with the age " + currentAge + " can vote.");
         } else {
            System.out.println("The student with the age " + currentAge + " cannot vote.");
         }
      }
      
      input.close();
   }
}
