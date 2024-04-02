import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {

    public static List<Integer> findDuplicates(int[] arr) {
        return Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())) // Group by occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter duplicates
                .map(Map.Entry::getKey) // Extract the numbers
                .collect(Collectors.toList()); // Collect into a list
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 8, 9, 9};
        List<Integer> duplicateNumbers = findDuplicates(arr);

        System.out.println("Duplicate numbers: " + duplicateNumbers);
    }
}
