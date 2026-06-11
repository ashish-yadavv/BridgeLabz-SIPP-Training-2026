import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.err.println("Invalid input. Number must be non-negative.");
            System.exit(0);
        }

        if (number == 0) {
            System.out.println("Original Number : 0");
            System.out.println("Reversed Number : 0");
            input.close();
            return;
        }

        int count = 0;
        long tempCount = number;
        while (tempCount > 0) {
            count++;
            tempCount /= 10;
        }

        int[] digits = new int[count];
        long  temp   = number;

        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Original Number : " + number);
        System.out.println();

        System.out.print("Reversed Number : ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();

        input.close();
    }
}
