package Lab6.exercise3;

import java.util.Scanner;

public class MirrorImage {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringBuilder temp=new StringBuilder(str);
	String mirror()
	{
		return(temp+"|"+temp.reverse());
	}

}
