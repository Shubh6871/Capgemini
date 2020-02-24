import java.util.*;
public class Lab4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		SOC(n);
	}
	
	public static void SOC(int n)
	{
		int sum=0,t=0;
		while(n>0)
		{
			t=n%10;
			n=n/10;
			t=t*t*t;
			sum=sum+t;
		}
		System.out.println(sum);
	}
	
}
