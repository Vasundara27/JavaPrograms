import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		ArmStrong armStrong= new ArmStrong();
		int num=armStrong.numberChecker(n);
		System.out.println("Sum of cubes of digits of a given number is "+num);
		if(n==num)
			
		{
			System.out.println("Entered number "+n+" is a ArmstrongNumber");
		}
		else 
			
		{
			System.out.println("Entered number "+n+" is not a ArmstrongNumber");
		}
		

	}

}
