import java.util.Scanner;

public class CubeApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println(CubeNumber(num));

	}
	public static int CubeNumber(int num)
	{
		return num*num*num;
	}

	}

