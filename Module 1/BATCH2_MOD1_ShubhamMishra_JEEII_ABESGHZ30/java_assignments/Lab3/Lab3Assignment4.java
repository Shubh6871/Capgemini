import java.util.*;

public class Lab3Assignment4
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] Array = new char[n];
		for(int i=0;i<n;i++)
		{
			Array[i]=sc.next().charAt(0);
		}
		count(Array,n);
		
	}

	public static void count(char []Array,int n)
	{
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
				if(Array[i]==Array[j])
				{
					c=c+1;
				}
			System.out.println(Array[i]+ " : " +c);
		}
	}
}