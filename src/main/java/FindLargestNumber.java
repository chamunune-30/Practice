
import java.util.Arrays;

public class FindLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};

        // Using Java streams to find the largest number
        int largestNumber = Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new RuntimeException("Elements cannot be empty" )); // Throws NoSuchElementException if the array is empty

        System.out.println("The largest number is: " + largestNumber);
    }
}