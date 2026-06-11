import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative number.");
            System.exit(0);
        }

        if (number == 0) {
            System.out.println("Digit 0 appears 1 time(s).");
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

        System.out.print("Digits in number : ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();

        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\n=== Digit Frequency ===");
        System.out.printf("%-8s %-10s%n", "Digit", "Frequency");
        System.out.println("-".repeat(18));

        for (int d = 0; d <= 9; d++) {
            if (frequency[d] > 0) {
                System.out.printf("%-8d %-10d%n", d, frequency[d]);
            }
        }

        input.close();
    }
}
