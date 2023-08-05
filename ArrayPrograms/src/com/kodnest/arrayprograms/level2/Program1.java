package com.kodnest.arrayprograms.level2;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array-1 length");
		int arr1[] =new int[scan.nextInt()];
		System.out.println("Enter array1 the elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter array-2 length");
		int arr2[] =new int[scan.nextInt()];
		System.out.println("Enter array2 the elements");
		for(int i=0;i<=arr2.length-1;i++)
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
		Merge merge=new Merge();
		int res[]=merge.margeArray(arr1,arr2);
		System.out.println("Array 3---");
		for(int x:res)
		{
			System.out.println(x+" ");
		}
	}
}
		