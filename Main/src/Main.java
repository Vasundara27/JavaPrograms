import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of sides");
		int n =scan.nextInt();
		identifyPolygon(n);

	}
	public static void identifyPolygon(int n)
	{
		switch(n)
		{
		case 3: 
			System.out.println("Traingle");
			break;
		case 4:
			System.out.println("Quradilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");	
			break;
		case 8 :
			System.out.println("Octagon");	
		case 9 :
			System.out.println("Nanogon");	
			break;
		default:
			System.out.println("Decagon");
		}
		
	}

}
