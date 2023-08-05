import java.util.Scanner;

public class RectangleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and breadth of a rectangle");
		int l =scan.nextInt();
		int b =scan.nextInt();
		AreaOfRectangle R= new AreaOfRectangle();
		R.Area(l, b);

}
}