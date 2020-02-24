package Lab5.exercise6;

import java.util.Scanner;

class MyException extends Exception
	{
		MyException(String s)
		{
			super(s);
		}
}
public class ValidateSalary{

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int salary=sc.nextInt();
			try {
				if(salary<3000)
					throw new MyException("Salary is less than 3000!!!!");
				else	
					System.out.println("Valid salary");
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}
			
			
		}

	}
	
