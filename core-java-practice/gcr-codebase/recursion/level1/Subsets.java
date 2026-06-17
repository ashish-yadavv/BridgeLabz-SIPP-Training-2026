import java.util.ArrayList;
import java.util.List;

public class Problem8Subsets {
    static void subsetsBySize(int[] arr, int size, int start, List<Integer> current) {
        if (current.size() == size) {
            System.out.println(current);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            subsetsBySize(arr, size, i + 1, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        for (int size = 0; size <= arr.length; size++) {
            subsetsBySize(arr, size, 0, new ArrayList<>());
        }
    }
}
