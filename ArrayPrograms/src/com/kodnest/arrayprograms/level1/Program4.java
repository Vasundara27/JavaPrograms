package com.kodnest.arrayprograms.level1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] =new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of all the elements in the array is "+sum);
		

	}

}
