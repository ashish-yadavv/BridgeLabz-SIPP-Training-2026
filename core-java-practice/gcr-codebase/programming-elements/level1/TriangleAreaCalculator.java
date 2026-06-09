import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();
        double areaInSquareInches = 0.5 * base * height;
        double squareInchesToSquareCm = 6.4516;
        double areaInSquareCm = areaInSquareInches * squareInchesToSquareCm;

        System.out.println("The area of the triangle with base " + base + " inches and height " + height + " inches is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");
    }
}
