package com.kodnest.arrayprograms.level1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in  array ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("array contents are---");
		for(int i:arr)
		{
			System.out.print((i+5)+" ");

	}

}
}
