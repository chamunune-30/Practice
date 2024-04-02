public class CalculatePiLeibniz {

    public static void main(String[] args) {
        int numTerms = 1000; // You can adjust the number of terms for accuracy

        double piApproximation = calculatePiLeibniz(numTerms);

        System.out.println("Approximation of pi using " + numTerms + " terms: " + piApproximation);
    }

    static double calculatePiLeibniz(int numTerms) {
        double approximation = 0.0;

        for (int n = 0; n < numTerms; n++) {
            double term = (n % 2 == 0) ? 1.0 : -1.0;
            approximation += term / (2 * n + 1);
        }

        return 4.0 * approximation;
    }
}
