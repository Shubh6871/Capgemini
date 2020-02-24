package Lab5.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in) ;
		try {
			System.out.println("Choose a light:");
			System.out.println("1. Red");
			System.out.println("2. Yellow");
			System.out.println("3. Green");
			
			int choice = sc.nextInt() ;
			switch(choice) {
			case 1:
				System.out.println("Stop");
				break ;
			case 2:
				System.out.println("Ready");
				break ;
			case 3:
				System.out.println("Go");
				break;
			default:
				throw new InvalidChoiceException("Select a valid light number") ;
			}
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Provide Integer value");
		}
		finally {
			sc.close();
		}

	}

}
