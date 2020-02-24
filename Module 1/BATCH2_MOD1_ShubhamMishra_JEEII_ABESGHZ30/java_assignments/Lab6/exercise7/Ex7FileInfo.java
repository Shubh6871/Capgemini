
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex7FileInfo {

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the filename/Location : ");
String file = sc.nextLine();
File f = new File(file);
System.out.println("File exists: "+f.exists());
System.out.println("File is readable: "+f.canRead());
System.out.println("File is writable: "+f.canWrite());
System.out.println("Is a directory: "+f.isDirectory());
System.out.println("length of the file: "+f.length()+" bytes");

try
{
char ch;
StringBuffer buff = new StringBuffer("");
FileInputStream fis = new FileInputStream(file);
while(fis.available()!=0)
{
ch = (char)fis.read();
buff.append(ch);
}
System.out.println("\nContents of the file are: ");
System.out.println(buff);
fis.close();
sc.close();
}
catch(FileNotFoundException e)
{
System.out.println("Given File cannot be found...");
}
catch(IOException i)
{
System.out.println("File can't be read...");
}
}
}