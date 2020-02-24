package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Exercise5.ArrayColl;

public class Exercise5 {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        Exercise5 ex=new Exercise5();
	        System.out.println("Enter the number of the element");
	        int n=sc.nextInt();
	        int array[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            array[i]=sc.nextInt();
	        }
	        int se=ex.getSecondSmallest(array);
	        System.out.println("Second smallest number is "+se);
	    }
	 int getSecondSmallest(int arr[])
	    {
	        List<Integer>lists= new ArrayList<>();
	        for (int i = 0; i < arr.length; i++)
	            {lists.add(arr[i]);
	            }
	            
	        Collections.sort(lists);

	       return lists.get(1);
	    }
}
