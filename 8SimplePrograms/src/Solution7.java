import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
			int res=printPrime(i);
			if(res!=0)
			{
				System.out.println(res);
				count++;
			}
		}
		System.out.println("Number Of Prime Numbers is = "+count);
		
				 
	}
	public static int  printPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0) 
			{
			  return 0;
			}
		}
		return n;
		
	}

}
