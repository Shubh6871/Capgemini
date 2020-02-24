import java.util.Scanner;
public class Lab1Exercise3
{
	static void CheckNumber(int n)
	{
		int a,b,c=0,t=n;
		
		while(n>10)
		{
			a=n%10;
			n=n/10;
			b=n%10;
			System.out.println(a);
			System.out.println(b);
			System.out.println(n);
			if(a>=b)
			{
				continue;
			}
			else
			{
				c=c+1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("YES- "+t+" is in increasing order.");
		}
		else
		{
			System.out.println("NO- "+t+" is not in increasing order.");
		}
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your Number");
		int n =sc.nextInt();
		CheckNumber(n);
	}
}
