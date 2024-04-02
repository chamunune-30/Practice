public class SmallestNumberInArray {

    public static int findSmallestNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {5, 2, 8, 1, 7};

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int smallestNumber = findSmallestNumber(numbers);
        System.out.println("\nSmallest Number: " + smallestNumber);
    }
}
