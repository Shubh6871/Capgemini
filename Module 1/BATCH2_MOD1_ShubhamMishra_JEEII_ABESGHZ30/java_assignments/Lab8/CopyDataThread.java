package Lab8;

import java.io.*;


public class CopyDataThread extends Thread

{   private String sourcePath, targetPath ;
	public CopyDataThread(String srcPath,String tgtPath) {
	this.sourcePath=srcPath;
	this.targetPath=tgtPath;
}
	public void run() {
		InputStream is=null;
		OutputStream os=null;
	
	try {
		String inputFilePath=sourcePath;
		String outputFilePath=targetPath;
		File outputFile=new File(outputFilePath);
		File inputFile=new File(inputFilePath);
		
		is=new FileInputStream(inputFile);
		os=new FileOutputStream(outputFile);
		int read;int count=0;
		while((read=is.read())>0) {
			count++;
			
			if(count==10) {
				Thread.sleep(5000);
				System.out.println("Ten Characters Copied");
				count=0;}
		char ch=(char) read;
		os.write(ch);
		}}
		catch(IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(is!=null)
					is.close();
				if(os!=null)
					os.close();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	


}}

