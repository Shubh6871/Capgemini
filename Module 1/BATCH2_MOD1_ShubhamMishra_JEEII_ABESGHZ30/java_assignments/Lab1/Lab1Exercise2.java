
public class Lab1Exercise2 
{
	static void CalculateDifference(int n)
	{
		int i,sum1=0;
		for(i=1;i<=n;i++)
		{
			sum1=sum1+i*i;
		}
		int sum2=0;
		for(i=1;i<=n;i++)
		{
			sum2=sum2+i;
		}
		sum2=sum2*sum2;
		int diff;
		diff=sum2-sum1;
		System.out.println("Sum of n square: "+sum1+ "\nSquare of sum: "+sum2);
		System.out.println("Difference: "+ diff);
	}
	public static void main(String[] args)
	{
		CalculateDifference(5);
		
	}
}

