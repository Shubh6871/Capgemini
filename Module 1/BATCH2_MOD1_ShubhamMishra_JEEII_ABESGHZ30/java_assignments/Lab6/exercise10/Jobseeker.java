package lab6.exercise10;

import java.util.Scanner;

public class Jobseeker {
	public boolean validUser(String user) {
		int count=0;
		int len=user.length();
		for(int i=1;i<=(len-3);i++)
		{
				 count++;
			}
		if((count>=8) && user.endsWith("_job"))
			return true;
		else
			return false;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter selected username");
	String user=sc.next();
	Jobseeker j=new Jobseeker();
	boolean r=j.validUser(user);
	if(r==true)
		System.out.println("true");
	else
		System.out.println("false");
}
}
