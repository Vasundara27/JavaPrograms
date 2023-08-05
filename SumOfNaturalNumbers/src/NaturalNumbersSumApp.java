import java.util.Scanner;
public class NaturalNumbersSumApp {
	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of Natural Numbers");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.printf("sum is "+sum);

	}

}
