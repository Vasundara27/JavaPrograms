import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N to print the numbers in the series");
		int n=scan.nextInt();
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.fibonacciSeries(n);
		

	}

}
