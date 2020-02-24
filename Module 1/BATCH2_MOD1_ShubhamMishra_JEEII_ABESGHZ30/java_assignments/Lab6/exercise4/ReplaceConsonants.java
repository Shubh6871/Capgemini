package Lab6.exercise4;

import java.util.Scanner;

public class ReplaceConsonants {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringBuilder strb=new StringBuilder(str);
	StringBuilder strtemp=new StringBuilder();
	
	char temp;
	int size=str.length();
	
	StringBuilder replace() {
		for(int i=0;i<size;i++)
		{
			temp=strb.charAt(i);
			if(temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
				strtemp.append(temp);
			else {
				temp+=1;
			strtemp.append(temp);
			}
		}
		return strtemp;
			
	}


}
