package Lab8;
import java.util.*;
 class Delay implements Runnable {
   
	@Override
	public void run() {
		while(true)
		{System.out.println(new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

}
 public class Exercise2 {
public static void main(String args[]) {
	
	Delay d=new Delay();
	Thread t=new Thread(d);
	t.start();
}
	
 }
