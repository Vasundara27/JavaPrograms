import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		displayDivisibleBy2and5(n);
				 
	}
	public static void  displayDivisibleBy2and5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			System.out.println(i);
		}
	}

}
