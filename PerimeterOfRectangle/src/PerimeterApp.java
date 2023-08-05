import java.util.Scanner;

public class PerimeterApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle");
		int a =scan.nextInt();
		int b =scan.nextInt();
		Perimeter p= new Perimeter();
		p.Rectangle(a,b);

	}

}
