package additional;

import java.io.*;
import java.util.*;

/**
 * Additional Problem 1: Employee Skill Assignment
 * Accepts employee data via Scanner, serializes the object,
 * and displays recovered employee information.
 *
 * Bonus: Given an array of skill scores, finds all project teams
 * whose total skill score equals a target value.
 */
public class EmployeeSkillAssignment {

    // ─── Employee class (Serializable) ───────────────────────────────────────

    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private int    employeeId;
        private String name;
        private String department;
        private double salary;

        public Employee(int employeeId, String name, String department, double salary) {
            this.employeeId = employeeId;
            this.name       = name;
            this.department = department;
            this.salary     = salary;
        }

        @Override
        public String toString() {
            return String.format(
                "Employee ID : %d%nName        : %s%nDepartment  : %s%nSalary      : %.2f",
                employeeId, name, department, salary
            );
        }
    }

    // ─── Serialization helpers ────────────────────────────────────────────────

    private static final String SERIAL_FILE = "employee.ser";

    private static void serializeEmployee(Employee emp) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(emp);
            System.out.println("\nEmployee serialized to '" + SERIAL_FILE + "'.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
    }

    private static Employee deserializeEmployee() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            return (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
            return null;
        }
    }

    // ─── Skill-score team finder (subset-sum) ────────────────────────────────

    /**
     * Finds all subsets of skillScores whose sum equals target.
     */
    private static List<List<Integer>> findProjectTeams(int[] skillScores, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(skillScores, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findSubsets(int[] scores, int remaining, int index,
                                    List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < scores.length; i++) {
            if (scores[i] <= remaining) {
                current.add(scores[i]);
                findSubsets(scores, remaining - scores[i], i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    // ─── Main ─────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Employee Skill Assignment =====");

        // 1. Accept data using Scanner
        System.out.print("Enter Employee ID  : ");
        int employeeId = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter Name         : ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter Department   : ");
        String department = scanner.nextLine().trim();

        System.out.print("Enter Salary       : ");
        double salary = Double.parseDouble(scanner.nextLine().trim());

        Employee emp = new Employee(employeeId, name, department, salary);

        // 2. Serialize the object
        serializeEmployee(emp);

        // 3. Deserialize and display recovered information
        Employee recovered = deserializeEmployee();
        if (recovered != null) {
            System.out.println("\n--- Recovered Employee Information ---");
            System.out.println(recovered);
        }

        // Bonus: skill-score team finder
        System.out.println("\n--- Project Team Finder (Skill Scores) ---");
        int[] skillScores = {10, 20, 30, 40, 50};
        int   target      = 60;
        System.out.println("Skill scores : " + Arrays.toString(skillScores));
        System.out.println("Target sum   : " + target);

        List<List<Integer>> teams = findProjectTeams(skillScores, target);
        if (teams.isEmpty()) {
            System.out.println("No teams found with total skill score = " + target);
        } else {
            System.out.println("Possible project teams:");
            for (List<Integer> team : teams) {
                System.out.println("  " + team);
            }
        }

        scanner.close();
    }
}
