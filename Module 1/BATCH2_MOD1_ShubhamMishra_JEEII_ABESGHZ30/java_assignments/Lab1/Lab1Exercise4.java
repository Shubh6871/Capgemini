import java.util.Scanner;

public class Lab1Exercise4
{
	static void CheckNumber(int n)
	{
		int c = n & (n-1);
		if(c==0)
		{
			System.out.println("YES- "+n+" is power of 2.");
		}
		else
		{
			System.out.println("NO- "+n+" is not power of 2.");
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
