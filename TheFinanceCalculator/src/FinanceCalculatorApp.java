import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the values");
		double principle=scan.nextDouble();
		double rate =scan.nextDouble();
		double time =scan.nextDouble();
		FinanceCalculator financeCalculator = new FinanceCalculator();
		System.out.printf("%.2f",financeCalculator.calculateSimpleInterest( principle, rate,  time));

	}

}
