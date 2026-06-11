import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative number.");
            System.exit(0);
        }

        if (number == 0) {
            System.out.println("The number is 0. Largest digit: 0, Second Largest digit: 0");
            input.close();
            return;
        }

        int maxDigit = 10;

        int[] digits = new int[maxDigit];
        int   index  = 0;

        long temp = number;

        while (temp != 0) {
            if (index == maxDigit) {
                System.out.println("Note: Number has more than " + maxDigit +
                                   " digits. Only first " + maxDigit + " digits considered.");
                break;
            }
            digits[index] = (int)(temp % 10);
            temp  /= 10;
            index++;
        }

        int digitCount = index;

        System.out.print("Digits stored  : ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int largest       = 0;
        int secondLargest = 0;

        for (int i = 0; i < digitCount; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest       = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit        : " + largest);
        System.out.println("Second Largest Digit : " + secondLargest);

        input.close();
    }
}
