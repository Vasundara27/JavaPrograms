import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  Character to check for digit or vowel or consonent");
		char ch=scan.next().charAt(0);
		IdentifyCharacter(ch);	

	}
	public static void IdentifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
		 System.out.println(" Entered Character "+ch+" is a Digit");
		}
		else if (!Character.isLetter(ch))
		{
			System.out.println("Entered Character "+ch+" is a Special Character");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered Character "+ch+" is a LowerCase Vowel");
				}
				else
				{
					System.out.println("Entered Character "+ch+" is a UpperCase Vowel");
				}
				break;
				
				default:
					if(Character.isLowerCase(ch))
					{
						System.out.println("Lower case consonant");
					}
					else
					{
						System.out.println("Upper case consonant");
						
					}
					
			
			}
		}
		
	}

}
