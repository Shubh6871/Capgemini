package Lab5.exercise5;

import java.util.Scanner;

class myException extends Exception {
	myException(String s)
	{
		super(s);
	}
}

public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<15)
			throw new myException("Age is less than 15!! Not valid");
			else	
				System.out.println("Age is valid");
		}
		catch(myException e)
		{
			System.out.println(e.getMessage());
		}

	}

}

