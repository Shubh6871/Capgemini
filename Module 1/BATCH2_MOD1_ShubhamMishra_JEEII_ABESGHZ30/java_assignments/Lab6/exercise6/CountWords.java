package lab6.exercise6;
import java.io.*;
public class CountWords 
{
public static void main(String args[]) throws IOException {
	
	
	File file=new File("C:\\Users\\Shaivi Sinha\\Desktop\\test.txt");
	FileInputStream fileStream=new FileInputStream(file);
	InputStreamReader input=new InputStreamReader(fileStream);
	BufferedReader reader=new BufferedReader(input);
	String line;
	int countWord = 0; 
    int sentenceCount = 0; 
    int characterCount = 0;
    int whitespaceCount=0;
    while((line = reader.readLine()) != null) 
    { 

        if(!(line.equals(""))) 
        { 
              
            characterCount += line.length(); 
            String[] wordList = line.split("\\s+"); 
            countWord += wordList.length; 
            whitespaceCount += countWord -1; 
            String[] sentenceList = line.split("[!?.:]+"); 
            sentenceCount += sentenceList.length; 
        } 
    } 
    System.out.println(characterCount);
    System.out.println(countWord);
    System.out.println(sentenceCount);
}
}
