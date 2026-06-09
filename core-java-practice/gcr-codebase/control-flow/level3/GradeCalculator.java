import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Physics (out of 100): ");
        double physicsMarks = input.nextDouble();

        System.out.print("Enter marks for Chemistry (out of 100): ");
        double chemistryMarks = input.nextDouble();

        System.out.print("Enter marks for Maths (out of 100): ");
        double mathsMarks = input.nextDouble();

        double averageMark = (physicsMarks + chemistryMarks + mathsMarks) / 3;

        String grade;
        String remarks;

        if (averageMark >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMark >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMark >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (averageMark >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMark >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Physics   : " + physicsMarks);
        System.out.println("Chemistry : " + chemistryMarks);
        System.out.println("Maths     : " + mathsMarks);
        System.out.printf("Average Mark: %.2f%%\n", averageMark);
        System.out.println("Grade     : " + grade);
        System.out.println("Remarks   : " + remarks);

        input.close();
    }
}
