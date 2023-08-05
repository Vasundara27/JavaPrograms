import java.util.Scanner;
public class TheJourneyCalculater {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time as realnumbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		Calculater calculater1 =new Calculater();
		System.out.printf("%.2f",calculater1.calculatedistance(speed,time));	
		

	}

}
