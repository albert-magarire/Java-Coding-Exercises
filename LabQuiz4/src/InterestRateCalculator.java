import java.util.Scanner;

public class InterestRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();

        System.out.printf("%-15s %-15s %-15s%n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double interestRate = 0.05; interestRate <= 0.08125; interestRate += 0.00125) {
            double monthlyInterestRate = interestRate / 12;
            int numberOfPayments = numberOfYears * 12;
            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
            double totalPaymentWithInterest = monthlyPayment * numberOfPayments;

            System.out.printf("%-15s %-15.2f %-15.2f%n", (float)(interestRate * 100) + "%", monthlyPayment, totalPaymentWithInterest);
        }
    }
}
