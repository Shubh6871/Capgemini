package Lab8;

public class FileProgram {
public static void main (String args[]) {
	String sourceFilepath="D:\\CAPG\\Array.java";
	String targetFilepath="D:\\CAPG\\A.txt";
	CopyDataThread cp=new CopyDataThread(sourceFilepath,targetFilepath);
 cp.start();
	
}
}
