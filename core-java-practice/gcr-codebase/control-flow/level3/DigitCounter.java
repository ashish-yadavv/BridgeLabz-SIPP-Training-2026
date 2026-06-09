import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;

        if (number == 0) {
            System.out.println("Number of digits in " + originalNumber + " = 1");
        } else {
            number = Math.abs(number);
            int count = 0;

            while (number != 0) {
                number = number / 10;
                count++;
            }

            System.out.println("Number of digits in " + originalNumber + " = " + count);
        }

        input.close();
    }
}
