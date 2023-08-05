import java.util.Scanner;

public class DecoderApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Alphbet");
		char ch=scan.next().charAt(0);
		MessageDecoder m=new MessageDecoder();
		System.out.println(m.decodeCharacter(ch));

	}
	}

