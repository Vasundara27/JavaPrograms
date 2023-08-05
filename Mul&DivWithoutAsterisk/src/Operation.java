import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int a=scan.nextInt();
		int res1=a<<2;
		System.out.println("Multiplication Result "+res1);// Multiplication Result
				
		int res2=a>>2;
		System.out.println("Division Result is "+res2);//Division Result
				

	}

}
