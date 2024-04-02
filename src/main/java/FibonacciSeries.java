import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(numTerms);

        scanner.close();
    }

    static void printFibonacciSeries(int numTerms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
