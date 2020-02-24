package Lab6.exercise5;

import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	
	sc.close();
	Number num=new Number();
	int n=num.modifyNumber(number);
	System.out.println(n);
}
int modifyNumber(int n) {
	int num=0,n1,n2;
	String s=Integer.toString(n);
	for(int i=0;i<s.length();i++)
	{n2=0;
       	n1=Character.getNumericValue(s.charAt(i));
       	if(i+1<s.length())
       	{n2=Character.getNumericValue(s.charAt(i+1));
       	int x=n1-n2;
       	num=num*10+Math.abs(x);}
       	
	}
	return num;
}
}
