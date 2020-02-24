import java.util.*;


public class Lab3Assignment3
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Array = new int[n];
		for(int i=0;i<n;i++)
		{
			Array[i]=sc.nextInt();
		}
		Sort(Array,n);
		
	}
	
	public static void Sort(int [] Array,int n)
	{
		for(int i=0;i<n;i++)
		{
			int num =0;
			while(Array[i]>0)
			{
				num=num*10+Array[i]%10;
				Array[i]=Array[i]/10;
			}
			Array[i]=num;
		}
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
	}
}