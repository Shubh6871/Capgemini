import java.util.*;

public class Lab3Assignment1
{
	public static int getSecondSmallest(int n)
	{
		int[] Array = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you Array");
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			Array[i]=a;
		}
		Arrays.sort(Array);
		Arrays.toString(Array);
		
		return Array[n-2];
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		
		int c = getSecondSmallest(n);
		System.out.println(c);
		
		
	}
}
