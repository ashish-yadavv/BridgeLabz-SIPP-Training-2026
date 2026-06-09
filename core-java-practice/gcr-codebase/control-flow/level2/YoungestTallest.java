import java.util.Scanner;

class YoungestTallest {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for ages of Amar, Akbar, Anthony
      int ageAmar = input.nextInt();
      int ageAkbar = input.nextInt();
      int ageAnthony = input.nextInt();

      // Get input for heights of Amar, Akbar, Anthony
      double heightAmar = input.nextDouble();
      double heightAkbar = input.nextDouble();
      double heightAnthony = input.nextDouble();

      // Find the youngest friend
      String youngest;
      if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
         youngest = "Amar";
      } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
         youngest = "Akbar";
      } else {
         youngest = "Anthony";
      }

      // Find the tallest friend
      String tallest;
      if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
         tallest = "Amar";
      } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
         tallest = "Akbar";
      } else {
         tallest = "Anthony";
      }

      // Display the results
      System.out.println("The youngest friend is: " + youngest);
      System.out.println("The tallest friend is: " + tallest);

      // Closing the Scanner Stream
      input.close();
   }
}
