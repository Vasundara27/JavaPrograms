import java.util.Scanner;
public class ReverseApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter A Number to find its Reverse");
		int n= scan.nextInt();
		NumberReverse numberReverse = new NumberReverse();
		int rev = numberReverse.findReverseOfNumber(n);
		System.out.println("Reverse of a number "+n+" is "+rev);
		if(n==rev)
		{
			System.out.println("Entered number " +n+ " is palindrome");
		}
		else
		{
			System.out.println("Entered number " +n+ " is  not a palindrome");
		}

	}

}
