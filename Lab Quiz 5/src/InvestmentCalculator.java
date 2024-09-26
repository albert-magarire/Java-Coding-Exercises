import java.util.Scanner;
public class InvestmentCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual Interest rate: ");
        double annualInterestRate = input.nextDouble();
        annualInterestRate /= 100;
        System.out.println("Years     Future Value");
        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate / 12, years);
            System.out.printf("%-10d%.2f\n", years, futureValue);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}
