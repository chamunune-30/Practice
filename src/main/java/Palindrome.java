import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }

    static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        // Reverse the number
        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }
}
