package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array-1 length");
		int arr1[] =new int[scan.nextInt()];
		System.out.println("Enter array1 the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Array elements before replacing negative numbers with zero");
		for(int x:arr1)
		{
			System.out.println(x+" ");
		}
		Replace replace=new Replace();
		replace.arrayReplace(arr1);
		System.out.println();
		System.out.println("Array elements after replacing negative numbers with zero");
		for(int x:arr1)
		{
			System.out.println(x+" ");
		}
		

	}

}
