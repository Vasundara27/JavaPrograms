import java.util.Scanner;

public class Main {
	
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter Purchage Amount");
	 double purchageAmount=scan.nextDouble();
	 checkDiscount(purchageAmount);

	}
	
	public static void checkDiscount(double purchageAmount)
	
	{
		if(purchageAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount not  Applicable");
		}
		
	}

}
