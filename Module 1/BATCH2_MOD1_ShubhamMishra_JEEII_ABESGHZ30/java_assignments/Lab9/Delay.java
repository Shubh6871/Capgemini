package Lab9;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Delay {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		service.scheduleAtFixedRate(new Task(), 0,10, TimeUnit.SECONDS);
	}
}

class Task extends Thread {
	public void run() {

		System.out.println(new Date());
	}
}
