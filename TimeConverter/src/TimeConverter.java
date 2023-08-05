import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time in minutes ");
		int min=scan.nextInt();
		System.out.println(convertToHours( min));

	}
	public static double convertToHours(int min) {
		return min/60.0;
	}

}
