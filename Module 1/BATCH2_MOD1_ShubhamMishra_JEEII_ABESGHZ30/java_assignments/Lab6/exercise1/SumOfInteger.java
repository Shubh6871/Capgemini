package Lab6.exercise1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfInteger {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer strtoken=new StringTokenizer(str," ");
		int sumofToken()
		{
			
			while(strtoken.hasMoreTokens())
			{
				String temp;
				temp=strtoken.nextToken();
				sum=sum+Integer.parseInt(temp);	
				System.out.println(temp);
			}
			return sum;
		}
}
