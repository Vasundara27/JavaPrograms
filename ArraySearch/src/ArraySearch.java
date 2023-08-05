import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] =new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter target");
		int target=scan.nextInt();
		Search search=new Search();
		boolean res=search.isPresent(target, arr);
		
		if(res==true)
		{
			System.out.println("Target is present");
		}
		else
		{
			System.out.println("Target is not found");
		}
				

	}
	

}
