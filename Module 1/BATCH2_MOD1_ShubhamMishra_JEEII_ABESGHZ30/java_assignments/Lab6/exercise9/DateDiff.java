package lab6.exercise9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class DateDiff {
		   public static void main(String[] args)
		   {
			   Scanner sc= new Scanner(System.in);
			   System.out.println("enter the date in the format yyyy-mm-dd");
			   String date=sc.next();
			   LocalDate ld=LocalDate.parse(date); 
		        LocalDate now = LocalDate.now();
		 
		        Period diff = Period.between(ld,now);
		 
		     System.out.printf("Difference is "+diff.getYears()+" years, "+diff.getMonths()+" months and "+diff.getDays()+"days old");
		   }
}
