import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");

		int a =scan.nextInt();
		int b =scan.nextInt();
		int c;
		System.out.println("Before Swapping");
		System.out.println(a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println(a+" "+b);

	}

}
