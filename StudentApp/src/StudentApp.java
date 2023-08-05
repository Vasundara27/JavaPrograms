import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter name and age");
		int n =scan.nextInt();
		String m=scan.next();
		Student student = new Student();
		student.age=n;
		student.name=m;
		System.out.println(student.age);
		System.out.println(student.name);
		
		
       
		

	}

}

