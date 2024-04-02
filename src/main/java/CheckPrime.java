import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Get and print the prime factors
        System.out.print("Prime factors of " + num + ": ");
        printPrimeFactors(num);

        scanner.close();
    }
    static void printPrimeFactors(int n) {
        // Divide the number by 2 until it is divisible
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // Check odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If the remaining number is a prime greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
