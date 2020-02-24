package Lab7;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	static char[] s= {'a','b','c','a','b','z','x','z','c','b'};
 public static void main(String[] args) {
	
	 Map<Character,Integer> map=new HashMap<>();
	 Exercise2 ex=new Exercise2();
	 map=ex.countCharacter(s);
	System.out.println(map);
	}
 Map<Character,Integer> countCharacter(char[] s){
	 Map<Character,Integer> map=new HashMap<>();
	 for(int i=0;i<s.length;i++)
	 {
		
		 map.put(s[i],0);//initialize values in map
	 }
	 for(int i=0;i<s.length;i++)
	 {
		 int count=map.get(s[i]);
		  count++; // increment occurrence of characters
		 map.put(s[i],count);
	 }
	 return map;
 }
}
