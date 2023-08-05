package com.kodnest.patterns.level5;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter array length");
			int arr1[] =new int[scan.nextInt()];
			System.out.println("Enter the elements");
			for(int i=0;i<=arr1.length-1;i++)
			{
				arr1[i]=scan.nextInt();
			}
			System.out.println("Array contents are---");
			for(int a:arr1)
				
			{
				System.out.println(a);
			}
			


	}

}
}
