import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }

        // Collect numbers with frequency greater than 1
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 8, 9, 9};
        List<Integer> duplicateNumbers = findDuplicates(arr);

        System.out.println("Duplicate numbers: " + duplicateNumbers);
    }
}
