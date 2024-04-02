public class LargestOddIntegerSubstring {

    public static String largestOddInteger(String num) {
        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            // Check if the current digit is odd
            if (digit % 2 == 1) {
                // Return the substring from the current position to the end of the string
                return num.substring(i);
            }
        }

        // If no odd integer is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        // Example usage:
        String num1 = "52"; // Output: "5"
        String num2 = "4206"; // Output: ""
        String num3 = "123456"; // Output: "1"

        System.out.println("Input: " + num1);
        System.out.println("Largest Odd Integer Substring: " + largestOddInteger(num1));

        System.out.println("\nInput: " + num2);
        System.out.println("Largest Odd Integer Substring: " + largestOddInteger(num2));

        System.out.println("\nInput: " + num3);
        System.out.println("Largest Odd Integer Substring: " + largestOddInteger(num3));
    }
}
