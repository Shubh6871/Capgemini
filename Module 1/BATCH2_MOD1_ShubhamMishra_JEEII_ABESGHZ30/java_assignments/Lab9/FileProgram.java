package Lab9;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class FileProgram {
		public static void main (String args[]) {
			String sourceFilepath="D:\\CAPG\\Array.java";
			String targetFilepath="D:\\CAPG\\A.txt";
			
			ExecutorService service= Executors.newSingleThreadExecutor();
			service.execute(new CopyDataThread(sourceFilepath,targetFilepath));
			
		}	}

