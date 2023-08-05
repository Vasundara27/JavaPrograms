package com.kodnest.patterns.level5;

public class Pattern3 {
	public static void main(String[]args)
	{
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				char ch='A';
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			
		}
	}

}
