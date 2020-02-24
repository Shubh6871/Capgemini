
public class Lab1Exercise1 
{
	static void CalculateSum(int n)
	{
		int i,sum=0;
		
		for(i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		
		System.out.print("Sum: " + sum);
	}
	public static void main(String[] args)
	{
		CalculateSum(10);
	}
}
