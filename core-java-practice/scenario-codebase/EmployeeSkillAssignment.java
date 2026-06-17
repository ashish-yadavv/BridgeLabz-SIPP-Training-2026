import java.util.ArrayList;
import java.util.List;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] skills, int target) {
        findTeams(skills, target, 0, new ArrayList<>());
    }

    private static void findTeams(int[] skills, int remaining, int index, List<Integer> current) {
        if (remaining == 0) {
            System.out.println(current);
            return;
        }
        if (index == skills.length || remaining < 0) {
            return;
        }
        current.add(skills[index]);
        findTeams(skills, remaining - skills[index], index + 1, current);
        current.remove(current.size() - 1);
        findTeams(skills, remaining, index + 1, current);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;
        findTeams(skills, target);
    }
}
