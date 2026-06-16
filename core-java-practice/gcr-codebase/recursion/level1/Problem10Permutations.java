import java.util.ArrayList;
import java.util.List;

public class Problem10Permutations {
    static void permutations(String s, String prefix, List<String> result) {
        if (s.isEmpty()) {
            result.add(prefix);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permutations(s.substring(0, i) + s.substring(i + 1),
                         prefix + s.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        permutations("ABC", "", result);
        for (String p : result) {
            System.out.println(p);
        }
    }
}
