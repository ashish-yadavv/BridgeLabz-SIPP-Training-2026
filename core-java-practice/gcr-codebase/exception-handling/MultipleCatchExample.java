import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            int[] arr = null;

            System.out.print("Do you want to initialize the array? (yes/no): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("yes")) {
                arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = (i + 1) * 10;
                }
            }

            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
