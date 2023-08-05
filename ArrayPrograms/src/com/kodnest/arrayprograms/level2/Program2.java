package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array-1 length");
		int arr1[] =new int[scan.nextInt()];
		System.out.println("Enter array1 the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int arr2[] =new int[arr1.length];
		System.out.println("Enter array2 the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("Array -1---");
		for(int x:arr1)
				{
			System.out.println(x+" ");
				}
		System.out.println("Array -2---");
		for(int x:arr2)
				{
			System.out.println(x+" ");
				}
		System.out.println();
		Sum sum=new Sum();
		int res[]=sum.findSum(arr1,arr2);
		System.out.println("Sum array elements");
		for(int x:res)
		{
			System.out.println(x+" ");
		}
		
		
		
		

	}

		
	}


