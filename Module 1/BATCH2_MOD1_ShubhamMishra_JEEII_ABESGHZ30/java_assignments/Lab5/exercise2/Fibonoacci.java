package Lab5.exercise2;

import java.util.Scanner;

public class Fibonoacci {
public static void main(String[] args) {
	System.out.println("Enter the nth value to get fibonacci");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Fibonoacci fb=new Fibonoacci();
    System.out.println("N fibonacci value by loop");
       int result=fb.fibloop(n);
       System.out.println(result);
       System.out.println("N fibonacci value by recursion");
        result=fb.fib(n);
       System.out.println(result);
}
int fib(int n)
{if(n==0)
	return 0;
if(n==1)
	return 1;
return(fib(n-1)+fib(n-2));
}
int fibloop(int n)
{ int result = 1,n1=0,n2=1;
	for(int i=1;i<n;i++)
	{
	result=n1+n2;
	n1=n2;
	n2=result;
	}
	return result;
}
}
