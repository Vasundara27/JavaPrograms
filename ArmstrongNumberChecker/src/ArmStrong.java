
public class ArmStrong {
	public int numberChecker(int n)
	{   
		int sum=0;
		while(n!=0)
		{   
			int rem = n%10;
			sum=sum+(int)Math.pow(rem,3);
			n=n/10;
			
		}
		return sum;
	}

}
