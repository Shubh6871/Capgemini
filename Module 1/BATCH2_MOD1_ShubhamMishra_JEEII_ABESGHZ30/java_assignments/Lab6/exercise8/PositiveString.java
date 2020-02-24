package lab6.exercise8;
import java.util.*;
import java.util.Arrays;
 class Positive 
{
public boolean positiveString(String str)
{
	StringBuffer sb=new StringBuffer();
	char[] c=str.toCharArray();
	char[] c1=new char[c.length];
	for(int i=0;i<c.length;i++)
	{
		c1[i]=c[i];
	}
	Arrays.sort(c);
	for(int i=0;i<c.length;i++)
	{
		sb.append(c[i]);
	}
	String str1=sb.toString();
	if(str1.equals(str))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
/* public class PositiveString
 {
	 public static void main(String[] args)
	 {
		 Positive p=new Positive();
		 Scanner sc=new Scanner(System.in);
		 String a=sc.next();
		 p.positiveString(a);
	 }
 }*/
