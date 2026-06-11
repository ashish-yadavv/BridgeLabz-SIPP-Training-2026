import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int totalFriends = names.length;

        int[]    age    = new int[totalFriends];
        double[] height = new double[totalFriends];

        System.out.println("=== Friends Age & Height Finder ===\n");
        for (int i = 0; i < totalFriends; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            while (true) {
                System.out.print("  Age (years)  : ");
                age[i] = input.nextInt();
                if (age[i] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid age. Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("  Height (cm)  : ");
                height[i] = input.nextDouble();
                if (height[i] > 0) {
                    break;
                } else {
                    System.out.println("  Invalid height. Please enter a positive value.");
                }
            }
            System.out.println();
        }

        int    youngestIndex = 0;
        int    tallestIndex  = 0;

        for (int i = 1; i < totalFriends; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("=== Results ===");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + " years)");
        System.out.println("Tallest Friend : " + names[tallestIndex]  + " (Height: " + height[tallestIndex] + " cm)");

        input.close();
    }
}
