package com.kodnest.arrayprograms.level1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array1 length");
		int arr1[] =new int[scan.nextInt()];
		System.out.println("Enter array1 the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter array2 length");
		int arr2[] =new int[scan.nextInt()];
		System.out.println("Enter array2 the elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int arr3[] =new int[arr1.length+arr2.length];
		for(int i=0;i<=arr3.length-1;i++)
		{    
			arr3[i]=arr1[i];
			arr3[i]=arr2[i];
			
		}
		
		System.out.print("Original array1 contents are--- ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(+arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Original array2 contents are--- ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(+arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Copied array3 contents are--- ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

	}


