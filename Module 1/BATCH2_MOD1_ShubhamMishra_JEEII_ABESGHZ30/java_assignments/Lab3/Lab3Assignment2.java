import java.util.*;

class Sorted
{
	public void Sort(char [] Array,int n)
	{
		Arrays.sort(Array);
		for(int i=0;i<n/2;i++)
		{
			Array[i]=(char)(Array[i]-'a'+'A');
		}
		System.out.println(Array);
	}

}
public class Lab3Assignment2
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
		Sorted S=new Sorted();
		S.Sort(Array,n);
	}
}