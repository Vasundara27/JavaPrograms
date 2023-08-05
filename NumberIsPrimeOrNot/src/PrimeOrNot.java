import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int N =scan.nextInt();
		
		for(int i=2;i<N;i++)
			{
				if (N%i==0) 
				{
					System.out.println(N+" is  Not a Prime Number");
				    return;
				}
			}
		System.out.println("Entered Number " +N+ " is Prime Number");

	}
}
