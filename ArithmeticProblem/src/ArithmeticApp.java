import java.util.Scanner;

public class ArithmeticApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		ArithmeticOperation p= new ArithmeticOperation();
		p.Add(a, b);
		p.Sub(a, b);
		p.Mul(a, b);
		p.Div(a, b);
		p.Reminder(a, b);

	}

}
