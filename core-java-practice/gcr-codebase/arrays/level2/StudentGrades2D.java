import java.util.Scanner;

class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] subjects   = {"Physics", "Chemistry", "Maths"};
        int      maxMarks   = 100;
        int      numSubjects = subjects.length;

        int numberOfStudents = 0;
        while (true) {
            System.out.print("Enter number of students: ");
            numberOfStudents = input.nextInt();
            if (numberOfStudents > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        int[][] marks = new int[numberOfStudents][numSubjects];

        double[] percentage = new double[numberOfStudents];
        String[] grade      = new String[numberOfStudents];

        System.out.println("\nEnter marks (0 - " + maxMarks + ") for each student:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                while (true) {
                    System.out.printf("  %-12s: ", subjects[j]);
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] >= 0 && marks[i][j] <= maxMarks) {
                        break;
                    } else {
                        System.out.println("  Invalid marks. Please enter a value between 0 and " + maxMarks + ".");
                    }
                }
            }
        }

        int totalMaxMarks = numSubjects * maxMarks;
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }

            percentage[i] = ((double) totalMarks / totalMaxMarks) * 100;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        System.out.println("\n=== Student Report Card (2D Array) ===");
        System.out.printf("%-10s %-10s %-12s %-8s %-12s %-6s%n",
                          "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-".repeat(58));

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-12d %-8d %-12.2f %-6s%n",
                              (i + 1),
                              marks[i][0], marks[i][1], marks[i][2],
                              percentage[i], grade[i]);
        }

        input.close();
    }
}
