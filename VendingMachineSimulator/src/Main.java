import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the code of the product");
		String code=scan.next();
		getProduct(code);
	}
		public static void getProduct(String productCode)
		{
			switch(productCode)
			{
			case"P01":System.out.println("COCA COLA");
			break;
			case"P02":System.out.println("Thumps Up");
			break;
			case"P03":System.out.println("MAZA");
			break;
			case"P04":System.out.println("SPRITE");
			break;
			case"P05":System.out.println("Bindu Jal Jeera");
			break;
			default:System.out.println("FIZZ");
			}
		}

	}


