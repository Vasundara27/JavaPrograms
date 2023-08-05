import java.util.Scanner;

public final class PlanetExplorer {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter radius of the sphere");
		double radius=scan.nextDouble();
		PlanetExplore p = new PlanetExplore();
		System.out.printf("%.2f",p.calculateSurfaceArea(radius));
		
	}

}
