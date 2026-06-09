import java.util.Scanner;

class HarshadChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number. (digit sum = " + sum + ")");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number. (digit sum = " + sum + ")");
        }

        input.close();
    }
}
